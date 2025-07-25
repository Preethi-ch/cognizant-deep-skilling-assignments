package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Department;
import com.cognizant.orm_learn.service.DepartmentService;
import com.cognizant.orm_learn.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    private static DepartmentService departmentService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        departmentService = context.getBean(DepartmentService.class);

        testGetDepartment();
    }

    private static void testGetDepartment() {
        LOGGER.info("Start");
        Department department = departmentService.get(1); 
        LOGGER.debug("Department: {}", department);
        LOGGER.debug("Employee List: {}", department.getEmployeeList());
        LOGGER.info("End");
    }
}
