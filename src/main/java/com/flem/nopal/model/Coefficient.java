package com.flem.nopal.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = Coefficient.TABLE_NAME, uniqueConstraints = {
        @UniqueConstraint(columnNames = {"id"}) ,
        @UniqueConstraint(columnNames = {"code"})
})
@Data
@Getter
@Setter
@ToString
public class Coefficient implements Serializable {
    public static final String TABLE_NAME = "coefficient";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private int id;

    @Basic(optional = false)
    @Column(name = "code", nullable = false)
    private String code;

    @Basic(optional = false)
    @Column(name = "libelle", nullable = false)
    private String libelle;
}
