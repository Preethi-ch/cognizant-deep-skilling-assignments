package com.cognizant.employeemanagement.entity;

import jakarta.persistence.*;

@Entity
public class Employee {

    @Id
    private Long id;

    private String name;
    private double salary;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

   
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public Department getDepartment() { return department; }
    public void setDepartment(Department department) { this.department = department; }
}
