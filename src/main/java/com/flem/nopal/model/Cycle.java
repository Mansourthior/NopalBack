package com.flem.nopal.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = Cycle.TABLE_NAME, uniqueConstraints = {
        @UniqueConstraint(columnNames = {"id"}) ,
        @UniqueConstraint(columnNames = {"cycle"})
})
@Data
@Getter
@Setter
@ToString
public class Cycle implements Serializable {
    public static final String TABLE_NAME = "ue";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private int id;

    @Basic(optional = false)
    @Column(name = "cycle", nullable = false)
    private Integer cycle;

    @Basic(optional = false)
    @Column(name = "libelle", nullable = false)
    private String libelle;


}
