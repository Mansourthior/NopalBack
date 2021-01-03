package com.flem.nopal.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = Matiere.TABLE_NAME, uniqueConstraints = {
        @UniqueConstraint(columnNames = {"id"}) ,
        @UniqueConstraint(columnNames = {"code"})
})
@Data
@Getter
@Setter
@ToString
public class Matiere implements Serializable {
    public static final String TABLE_NAME = "matiere";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private int id;

    @Basic(optional = false)
    @Column(name = "libelle", nullable = false)
    private String libelle;

    @Basic(optional = false)
    @Column(name = "code", nullable = false)
    private String code;

    @JoinColumn(name = "linked_professeur", referencedColumnName = "id", nullable = false)
    @OneToOne(optional = false)
    private Account linkedProfesseur;

    @JoinColumn(name = "linked_semestre", referencedColumnName = "id", nullable = false)
    @OneToOne(optional = false)
    private Semestre linkedSemestre;

    @JoinColumn(name = "linked_ue", referencedColumnName = "id", nullable = false)
    @OneToOne(optional = false)
    private Ue linkedUe;
}
