package com.flem.nopal.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Account {
    private int id;
    private String login;
    private String password;
    private int linkedUserDetails;
    private int linkedRole;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "linked_user_details")
    public int getLinkedUserDetails() {
        return linkedUserDetails;
    }

    public void setLinkedUserDetails(int linkedUserDetails) {
        this.linkedUserDetails = linkedUserDetails;
    }

    @Basic
    @Column(name = "linked_role")
    public int getLinkedRole() {
        return linkedRole;
    }

    public void setLinkedRole(int linkedRole) {
        this.linkedRole = linkedRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id && linkedUserDetails == account.linkedUserDetails && linkedRole == account.linkedRole && Objects.equals(login, account.login) && Objects.equals(password, account.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, password, linkedUserDetails, linkedRole);
    }
}
