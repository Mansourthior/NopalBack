package com.flem.nopal.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = Semestre.TABLE_NAME, uniqueConstraints = {
        @UniqueConstraint(columnNames = {"id"}) ,
        @UniqueConstraint(columnNames = {"semestre"})
})
@Data
@Getter
@Setter
@ToString
public class Semestre implements Serializable {

    public static final String TABLE_NAME = "semestre";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private int id;

    @Basic(optional = false)
    @Column(name = "date_debut", nullable = false)
    private Date dateDebut;

    @Basic(optional = false)
    @Column(name = "date_fin", nullable = false)
    private Date dateFin;

    @Basic(optional = false)
    @Column(name = "semestre", nullable = false)
    private Integer semestre;

    @JoinColumn(name = "linked_annee", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = true)
    private Annee linkedAnnee;
}
