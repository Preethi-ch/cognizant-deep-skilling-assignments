package com.example.employeemanagement.controller;

import com.example.employeemanagement.model.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeRepository repo;

    public EmployeeController(EmployeeRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee emp) {
        return repo.save(emp);
    }

   
    @GetMapping
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    
    @GetMapping("/by-department")
    public List<Employee> getByDepartment(@RequestParam String name) {
        return repo.findByDepartmentName(name);
    }

   
    @GetMapping("/search")
    public List<Employee> searchByName(@RequestParam String name) {
        return repo.searchByNameLike(name);
    }
}
