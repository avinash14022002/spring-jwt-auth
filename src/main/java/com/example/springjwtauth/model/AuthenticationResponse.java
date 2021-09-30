package com.example.springjwtauth.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Avinash Vijayvargiya on 30-09-2021.
 */
public class AuthenticationResponse implements Serializable {

    private static final long serialVersionUID = 345L;

    private final String jwt;
    private int id;
    private String username;
    private List<String> roles;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

}

