package com.example.employeemanagement.controller;

import com.example.employeemanagement.model.Department;
import com.example.employeemanagement.repository.DepartmentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentRepository repo;

    public DepartmentController(DepartmentRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Department createDepartment(@RequestBody Department dept) {
        return repo.save(dept);
    }

    @GetMapping
    public List<Department> getAllDepartments() {
        return repo.findAll();
    }
}
