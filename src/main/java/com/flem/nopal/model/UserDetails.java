package com.flem.nopal.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = UserDetails.TABLE_NAME, uniqueConstraints = {
        @UniqueConstraint(columnNames = {"id"})})
@Data
@Getter
@Setter
@ToString
public class UserDetails implements Serializable {
    public static final String TABLE_NAME = "user_details";

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private int id;

    @Basic(optional = false)
    @Column(name = "nom", nullable = false)
    private String nom;

    @Basic(optional = false)
    @Column(name = "prenom", nullable = false)
    private String prenom;

    @Basic(optional = false)
    @Column(name = "adresse", nullable = false)
    private String adresse;

    @Basic(optional = false)
    @Column(name = "telephone", nullable = false)
    private int telephone;

    @Basic(optional = false)
    @Column(name = "email", nullable = false)
    private String email;

    @JoinColumn(name = "linked_profession", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = true)
    private Profession linkedProfession;

}
