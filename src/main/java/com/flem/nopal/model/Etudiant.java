package com.flem.nopal.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = Etudiant.TABLE_NAME, uniqueConstraints = {
        @UniqueConstraint(columnNames = {"id"}),
        @UniqueConstraint(columnNames = {"nom","prenom"})
})
@Getter
@Setter
@ToString
public class Etudiant implements Serializable {
    public static final String TABLE_NAME = "etudiant";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private int id;

    @Basic(optional = false)
    @Column(name = "nom", nullable = false)
    private String nom;

    @Basic(optional = false)
    @Column(name = "prenom", nullable = false)
    private String prenom;

    @JoinColumn(name = "linked_classe", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = true)
    private Classe linkedClasse;
}
