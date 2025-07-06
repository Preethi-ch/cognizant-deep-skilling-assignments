package com.cognizant.orm_learn.model;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    private int id;

    private String username;

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
