package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Employee;
import com.cognizant.orm_learn.model.Skill;
import com.cognizant.orm_learn.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    @Transactional  
    public void run(String... args) {
        System.out.println("Getting Employee by ID = 1");
        Employee employee = employeeRepository.findById(1).orElse(null);
        if (employee != null) {
            System.out.println("Name: " + employee.getName());
            System.out.println("Department: " + employee.getDepartment().getName());
            System.out.println("Skills:");
            for (Skill skill : employee.getSkillList()) {
                System.out.println(" - " + skill.getName());
            }
        } else {
            System.out.println("Employee not found.");
        }
    }
}
