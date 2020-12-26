package com.flem.nopal.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Note {
    private int id;
    private Integer note;
    private int linkedProfesseur;
    private int linkedEtudiant;
    private int linkedEvaluation;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "note")
    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
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
    @Column(name = "linked_etudiant")
    public int getLinkedEtudiant() {
        return linkedEtudiant;
    }

    public void setLinkedEtudiant(int linkedEtudiant) {
        this.linkedEtudiant = linkedEtudiant;
    }

    @Basic
    @Column(name = "linked_evaluation")
    public int getLinkedEvaluation() {
        return linkedEvaluation;
    }

    public void setLinkedEvaluation(int linkedEvaluation) {
        this.linkedEvaluation = linkedEvaluation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note1 = (Note) o;
        return id == note1.id && linkedProfesseur == note1.linkedProfesseur && linkedEtudiant == note1.linkedEtudiant && linkedEvaluation == note1.linkedEvaluation && Objects.equals(note, note1.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, note, linkedProfesseur, linkedEtudiant, linkedEvaluation);
    }
}
