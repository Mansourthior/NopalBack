package com.flem.nopal.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = Note.TABLE_NAME, uniqueConstraints = {
        @UniqueConstraint(columnNames = {"id"})
})
@Data
@Getter
@Setter
@ToString
public class Note implements Serializable {
    public static final String TABLE_NAME = "note";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private int id;

    @Basic(optional = false)
    @Column(name = "note", nullable = false)
    private Integer note;

    @JoinColumn(name = "linked_professeur", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false)
    private Account linkedProfesseur;

    @JoinColumn(name = "linked_etudiant", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = true)
    private Etudiant linkedEtudiant;

    @JoinColumn(name = "linked_evaluation", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = true)
    private Evaluation linkedEvaluation;
}
