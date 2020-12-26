package com.flem.nopal.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Matiere {
    private int id;
    private String libelle;
    private String code;
    private int linkedProfesseur;
    private int linkedPeriode;
    private int linkedUe;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "libelle")
    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Basic
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "linked_professeur")
    public int getLinkedProfesseur() {
        return linkedProfesseur;
    }

    public void setLinkedProfesseur(int linkedProfesseur) {
        this.linkedProfesseur = linkedProfesseur;
    }

    @Basic
    @Column(name = "linked_periode")
    public int getLinkedPeriode() {
        return linkedPeriode;
    }

    public void setLinkedPeriode(int linkedPeriode) {
        this.linkedPeriode = linkedPeriode;
    }

    @Basic
    @Column(name = "linked_ue")
    public int getLinkedUe() {
        return linkedUe;
    }

    public void setLinkedUe(int linkedUe) {
        this.linkedUe = linkedUe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matiere matiere = (Matiere) o;
        return id == matiere.id && linkedProfesseur == matiere.linkedProfesseur && linkedPeriode == matiere.linkedPeriode && linkedUe == matiere.linkedUe && Objects.equals(libelle, matiere.libelle) && Objects.equals(code, matiere.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, libelle, code, linkedProfesseur, linkedPeriode, linkedUe);
    }
}
