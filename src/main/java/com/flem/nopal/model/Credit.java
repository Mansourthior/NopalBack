package com.flem.nopal.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Getter
@Setter
@ToString
@Table(name = Credit.TABLE_NAME, uniqueConstraints = {
        @UniqueConstraint(columnNames = {"id"}) ,
        @UniqueConstraint(columnNames = {"code"})
})
public class Credit implements Serializable {

    public static final String TABLE_NAME = "credit";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private int id;

    @Basic(optional = false)
    @Column(name = "credit", nullable = false)
    private Integer credit;

    @Basic(optional = false)
    @Column(name = "code", nullable = false)
    private String code;

    @JoinColumn(name = "linked_matiere", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = true)
    private Matiere linkedMatiere;

    @JoinColumn(name = "linked_classe", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = true)
    private Classe linkedClasse;
}
