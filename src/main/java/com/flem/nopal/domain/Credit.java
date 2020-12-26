package com.flem.nopal.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Credit {
    private int id;
    private Integer credit;
    private String code;
    private int linkedMatiere;
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
    @Column(name = "credit")
    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
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
    @Column(name = "linked_matiere")
    public int getLinkedMatiere() {
        return linkedMatiere;
    }

    public void setLinkedMatiere(int linkedMatiere) {
        this.linkedMatiere = linkedMatiere;
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
        Credit credit1 = (Credit) o;
        return id == credit1.id && linkedMatiere == credit1.linkedMatiere && linkedClasse == credit1.linkedClasse && Objects.equals(credit, credit1.credit) && Objects.equals(code, credit1.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, credit, code, linkedMatiere, linkedClasse);
    }
}
