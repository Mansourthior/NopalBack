package com.flem.nopal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = Annee.TABLE_NAME, uniqueConstraints = {
        @UniqueConstraint(columnNames = {"id"}) ,
        @UniqueConstraint(columnNames = {"annee"})
})
@Data
@Getter
@Setter
@ToString
public class Annee implements Serializable {

    public static final String TABLE_NAME = "annee";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private int id;

    @Basic(optional = false)
    @Column(name = "date_deb", nullable = false)
    private Date dateDeb;

    @Basic(optional = false)
    @Column(name = "date_fin", nullable = false)
    private Date dateFin;

    @Basic(optional = false)
    @Column(name = "annee", nullable = false)
    private Integer annee;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "linkedAnnee")
    private Collection<Semestre> classes;

}
