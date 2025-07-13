package com.cognizant.employeemanagement.service;

import com.cognizant.employeemanagement.dto.EmployeeDTO;
import com.cognizant.employeemanagement.dto.EmployeeCustomProjection;
import com.cognizant.employeemanagement.projection.EmployeeNameAndSalary;
import com.cognizant.employeemanagement.repository.EmployeeRepository;
import com.cognizant.employeemanagement.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<EmployeeDTO> getDTOs(String dept) {
        return repository.findEmployeeDTOsByDepartmentName(dept);
    }

    public List<EmployeeNameAndSalary> getNameAndSalary(String dept) {
        return repository.findByDepartment_NameIgnoreCase(dept);
    }

    public List<EmployeeCustomProjection> getCustomProjections(String dept) {
        return repository.findByDepartment_Name(dept);
    }

    public List<Employee> getAllEmployees() {
        return (List<Employee>) repository.findAll(); 
    }
}
