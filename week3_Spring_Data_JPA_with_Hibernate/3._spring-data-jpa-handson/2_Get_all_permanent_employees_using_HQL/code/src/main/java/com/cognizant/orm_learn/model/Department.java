package com.cognizant.orm_learn.model;

import jakarta.persistence.*;

@Entity
@Table(name = "department")
public class Department {
    @Id
    private int id;

    private String name;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
