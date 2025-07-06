package com.cognizant.orm_learn;

import com.cognizant.orm_learn.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) {
        testGetAverageSalary();
    }

    public void testGetAverageSalary() {
        System.out.println("Overall Average Salary: " + employeeService.getAverageSalary());

        Double avgDept1 = employeeService.getAverageSalaryByDepartmentId(1);
        System.out.println("Average Salary in Department 1: " + (avgDept1 != null ? avgDept1 : "No employees"));

        Double avgDept2 = employeeService.getAverageSalaryByDepartmentId(2);
        System.out.println("Average Salary in Department 2: " + (avgDept2 != null ? avgDept2 : "No employees"));

        Double avgDept99 = employeeService.getAverageSalaryByDepartmentId(99);
        System.out.println("Average Salary in Department 99: " + (avgDept99 != null ? avgDept99 : "No employees"));
    }
}
