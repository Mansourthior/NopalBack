package com.flem.nopal.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Classe {
    private int id;
    private String libelle;
    private String code;
    private int linkedDepartement;
    private int linkedCycle;

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
    @Column(name = "linked_departement")
    public int getLinkedDepartement() {
        return linkedDepartement;
    }

    public void setLinkedDepartement(int linkedDepartement) {
        this.linkedDepartement = linkedDepartement;
    }

    @Basic
    @Column(name = "linked_cycle")
    public int getLinkedCycle() {
        return linkedCycle;
    }

    public void setLinkedCycle(int linkedCycle) {
        this.linkedCycle = linkedCycle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classe classe = (Classe) o;
        return id == classe.id && linkedDepartement == classe.linkedDepartement && linkedCycle == classe.linkedCycle && Objects.equals(libelle, classe.libelle) && Objects.equals(code, classe.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, libelle, code, linkedDepartement, linkedCycle);
    }
}
