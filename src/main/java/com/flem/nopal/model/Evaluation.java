package com.flem.nopal.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = Evaluation.TABLE_NAME, uniqueConstraints = {
        @UniqueConstraint(columnNames = {"id"}) ,
        @UniqueConstraint(columnNames = {"type"})
})
@Data
@Getter
@Setter
@ToString
public class Evaluation implements Serializable {
    public static final String TABLE_NAME = "evaluation";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private int id;

    @Basic(optional = false)
    @Column(name = "type", nullable = false)
    private String type;

    @JoinColumn(name = "linked_coefficient", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = true)
    private Coefficient linkedCoefficient;

    @JoinColumn(name = "linked_matiere", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = true)
    private Matiere linkedMatiere;

}
