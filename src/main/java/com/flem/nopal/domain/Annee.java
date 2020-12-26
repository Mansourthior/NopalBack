package com.flem.nopal.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Annee {
    private int id;
    private Date dateDeb;
    private Date dateFin;
    private Integer annee;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date_deb")
    public Date getDateDeb() {
        return dateDeb;
    }

    public void setDateDeb(Date dateDeb) {
        this.dateDeb = dateDeb;
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
    @Column(name = "annee")
    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Annee annee1 = (Annee) o;
        return id == annee1.id && Objects.equals(dateDeb, annee1.dateDeb) && Objects.equals(dateFin, annee1.dateFin) && Objects.equals(annee, annee1.annee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateDeb, dateFin, annee);
    }
}
