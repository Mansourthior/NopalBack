package com.flem.nopal.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Semestre {
    private int id;
    private Date dateDebut;
    private Date dateFin;
    private Integer semestre;
    private int linkedAnnee;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date_debut")
    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    @Basic
    @Column(name = "date_fin")
    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    @Basic
    @Column(name = "semestre")
    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    @Basic
    @Column(name = "linked_annee")
    public int getLinkedAnnee() {
        return linkedAnnee;
    }

    public void setLinkedAnnee(int linkedAnnee) {
        this.linkedAnnee = linkedAnnee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Semestre semestre1 = (Semestre) o;
        return id == semestre1.id && linkedAnnee == semestre1.linkedAnnee && Objects.equals(dateDebut, semestre1.dateDebut) && Objects.equals(dateFin, semestre1.dateFin) && Objects.equals(semestre, semestre1.semestre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateDebut, dateFin, semestre, linkedAnnee);
    }
}
