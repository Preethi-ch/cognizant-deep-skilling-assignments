package com.example.employeemanagement.repository;

import com.example.employeemanagement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    
    List<Employee> findByName(String name);

    List<Employee> findByDepartmentId(Long departmentId);

    List<Employee> findByEmailContainingIgnoreCase(String email);
}
