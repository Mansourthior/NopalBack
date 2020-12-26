package com.flem.nopal.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Evaluation {
    private int id;
    private String type;
    private int linkedCoefficient;
    private int linkedMatiere;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "linked_coefficient")
    public int getLinkedCoefficient() {
        return linkedCoefficient;
    }

    public void setLinkedCoefficient(int linkedCoefficient) {
        this.linkedCoefficient = linkedCoefficient;
    }

    @Basic
    @Column(name = "linked_matiere")
    public int getLinkedMatiere() {
        return linkedMatiere;
    }

    public void setLinkedMatiere(int linkedMatiere) {
        this.linkedMatiere = linkedMatiere;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Evaluation that = (Evaluation) o;
        return id == that.id && linkedCoefficient == that.linkedCoefficient && linkedMatiere == that.linkedMatiere && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, linkedCoefficient, linkedMatiere);
    }
}
