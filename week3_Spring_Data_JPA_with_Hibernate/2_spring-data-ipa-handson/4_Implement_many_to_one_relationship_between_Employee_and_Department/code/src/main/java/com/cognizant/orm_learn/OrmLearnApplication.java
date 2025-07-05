package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Department;
import com.cognizant.orm_learn.model.Employee;
import com.cognizant.orm_learn.service.DepartmentService;
import com.cognizant.orm_learn.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.text.SimpleDateFormat;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    private static EmployeeService employeeService;
    private static DepartmentService departmentService;

    public static void main(String[] args) throws Exception {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);

        employeeService = context.getBean(EmployeeService.class);
        departmentService = context.getBean(DepartmentService.class);

        
        testUpdateEmployee();
    }

    private static void testGetEmployee() {
        LOGGER.info("Start");
        Employee employee = employeeService.get(1);
        LOGGER.debug("Employee: {}", employee);
        LOGGER.debug("Department: {}", employee.getDepartment());
        LOGGER.info("End");
    }

    private static void testAddEmployee() throws Exception {
        LOGGER.info("Start");
        Employee emp = new Employee();
        emp.setName("Preethi");
        emp.setSalary(60000.0);
        emp.setPermanent(true);
        emp.setDateOfBirth(new SimpleDateFormat("dd/MM/yyyy").parse("02/03/2001"));

        Department dept = departmentService.get(1);
        emp.setDepartment(dept);

        employeeService.save(emp);
        LOGGER.debug("Saved Employee: {}", emp);
        LOGGER.info("End");
    }

    private static void testUpdateEmployee() {
        LOGGER.info("Start");
        Employee emp = employeeService.get(1);
        Department newDept = departmentService.get(2); 
        emp.setDepartment(newDept);

        employeeService.save(emp);
        LOGGER.debug("Updated Employee: {}", emp);
        LOGGER.info("End");
    }
}
