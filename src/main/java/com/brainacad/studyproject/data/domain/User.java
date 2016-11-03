package com.brainacad.studyproject.data.domain;

/**
 * Created by Alexander on 11/3/2016.
 */
public class User {

    private String username;
    private String password;
    private Role role;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
