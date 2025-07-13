package com.cognizant.employeemanagement.controller;

import com.cognizant.employeemanagement.dto.EmployeeCustomProjection;
import com.cognizant.employeemanagement.dto.EmployeeDTO;
import com.cognizant.employeemanagement.entity.Employee;
import com.cognizant.employeemanagement.projection.EmployeeNameAndSalary;
import com.cognizant.employeemanagement.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/interface/{dept}")
    public List<EmployeeNameAndSalary> getInterface(@PathVariable String dept) {
        return service.getNameAndSalary(dept);
    }

    @GetMapping("/dto/{dept}")
    public List<EmployeeDTO> getDTO(@PathVariable String dept) {
        return service.getDTOs(dept);
    }

    @GetMapping("/custom/{dept}")
    public List<EmployeeCustomProjection> getCustom(@PathVariable String dept) {
        return service.getCustomProjections(dept);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }
}
