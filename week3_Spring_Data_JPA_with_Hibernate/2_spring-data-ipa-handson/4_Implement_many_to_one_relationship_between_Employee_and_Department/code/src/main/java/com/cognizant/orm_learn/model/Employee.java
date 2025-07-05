package com.cognizant.orm_learn.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "employee")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") 
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "salary")
    private double salary;

    @Column(name = "permanent")
    private boolean permanent;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    
    @ManyToOne
    @JoinColumn(name = "department_id") 
    private Department department;

    
    @ManyToMany
    @JoinTable(
        name = "employee_skill", 
        joinColumns = @JoinColumn(name = "employee_id"), 
        inverseJoinColumns = @JoinColumn(name = "skill_id") 
    )
    private List<Skill> skillList;
}
