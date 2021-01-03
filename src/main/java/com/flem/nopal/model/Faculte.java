package com.flem.nopal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = Faculte.TABLE_NAME, uniqueConstraints = {
        @UniqueConstraint(columnNames = {"id"}) ,
        @UniqueConstraint(columnNames = {"code"})
})
@Data
@Getter
@Setter
@ToString
public class Faculte implements Serializable {

    public static final String TABLE_NAME = "faculte";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private int id;

    @Basic(optional = false)
    @Column(name = "libelle", nullable = false)
    private String libelle;

    @Basic(optional = false)
    @Column(name = "code", nullable = false)
    private String code;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "linkedFaculte")
    private Collection<Departement> departements;
}
