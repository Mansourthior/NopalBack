package com.flem.nopal.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = Account.TABLE_NAME, uniqueConstraints = {
        @UniqueConstraint(columnNames = {"id"}) ,
        @UniqueConstraint(columnNames = {"login"})
})
@Data @Getter @Setter @ToString
public class Account implements Serializable {

    public static final String TABLE_NAME = "account";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private int id;

    @Basic(optional = false)
    @Column(name = "login", nullable = false)
    private String login;

    @Basic(optional = false)
    @Column(name = "password", nullable = false)
    private String password;

    @JoinColumn(name = "linked_user_details", referencedColumnName = "id", nullable = false)
    @OneToOne(optional = false)
    private UserDetails linkedUserDetails;

    @JoinColumn(name = "linked_role", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = true)
    private Role linkedRole;


}
