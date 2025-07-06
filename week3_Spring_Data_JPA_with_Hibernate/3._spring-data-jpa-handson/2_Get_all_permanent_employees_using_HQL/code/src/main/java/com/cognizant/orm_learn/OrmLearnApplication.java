package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Employee;
import com.cognizant.orm_learn.model.Skill;
import com.cognizant.orm_learn.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) {
        testGetAllPermanentEmployees();
    }

    public void testGetAllPermanentEmployees() {
    System.out.println("Start");
    List<Employee> employees = employeeService.getAllPermanentEmployees();

    for (Employee e : employees) {
        System.out.println("Employee: " + e.getName());
        System.out.println("Department: " + e.getDepartment().getName());

        List<Skill> skills = e.getSkillList();
        for (Skill skill : skills) {
            System.out.println("Skill: " + skill.getName());
        }
    }

    System.out.println("End");
}

}
