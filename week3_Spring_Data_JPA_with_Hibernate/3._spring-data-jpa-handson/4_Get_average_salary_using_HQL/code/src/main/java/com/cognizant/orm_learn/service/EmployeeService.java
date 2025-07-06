package com.cognizant.orm_learn.service;

import com.cognizant.orm_learn.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Double getAverageSalary() {
        return employeeRepository.getAverageSalary();
    }

    public Double getAverageSalaryByDepartmentId(int id) {
        return employeeRepository.getAverageSalaryByDepartmentId(id);
    }
}
