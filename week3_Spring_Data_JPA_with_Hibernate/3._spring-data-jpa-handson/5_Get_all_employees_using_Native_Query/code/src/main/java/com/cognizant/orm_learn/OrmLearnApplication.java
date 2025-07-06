package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Employee;
import com.cognizant.orm_learn.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) {
        testGetAllEmployeesNative();
    }

    public void testGetAllEmployeesNative() {
        List<Employee> employees = employeeService.getAllEmployeesNative();
        System.out.println("---- All Employees via Native Query ----");
        for (Employee emp : employees) {
            System.out.println("ID: " + emp.getId() + ", Name: " + emp.getName() +
                    ", Salary: " + emp.getSalary() + ", Dept: " + (emp.getDepartment() != null ? emp.getDepartment().getName() : "N/A"));
        }
    }
}
