package com.brainacad.studyproject.data.domain;

/**
 * Created by Alexander on 11/3/2016.
 */
public class User {

    private int id;
    private String username;
    private String password;
    private Role role;

    public int getId() {
        return id;
    }

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

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "User { " +
                "id = " + id +
                ", username = " + username +
                ", password = " + password +
                ", role = " + role +
                "}";
    }
}
