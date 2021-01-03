package com.flem.nopal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = Classe.TABLE_NAME, uniqueConstraints = {
        @UniqueConstraint(columnNames = {"id"}) ,
        @UniqueConstraint(columnNames = {"code"})
})
@Data
@Getter
@Setter
@ToString
public class Classe implements Serializable {
    public static final String TABLE_NAME = "classe";

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

    @JoinColumn(name = "linked_departement", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = true)
    private Departement linkedDepartement;

    @JoinColumn(name = "linked_cycle", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = true)
    private Cycle linkedCycle;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "linkedClasse")
    private Collection<Etudiant> etudiants;
}
