package com.flem.nopal.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Etudiant {
    private int id;
    private String nom;
    private String prenom;
    private int linkedClasse;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nom")
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "prenom")
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Basic
    @Column(name = "linked_classe")
    public int getLinkedClasse() {
        return linkedClasse;
    }

    public void setLinkedClasse(int linkedClasse) {
        this.linkedClasse = linkedClasse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return id == etudiant.id && linkedClasse == etudiant.linkedClasse && Objects.equals(nom, etudiant.nom) && Objects.equals(prenom, etudiant.prenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, prenom, linkedClasse);
    }
}
