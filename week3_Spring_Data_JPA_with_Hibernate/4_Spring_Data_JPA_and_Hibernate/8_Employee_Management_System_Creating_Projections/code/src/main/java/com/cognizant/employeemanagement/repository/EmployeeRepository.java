package com.cognizant.employeemanagement.repository;

import com.cognizant.employeemanagement.dto.EmployeeDTO;
import com.cognizant.employeemanagement.dto.EmployeeCustomProjection;
import com.cognizant.employeemanagement.entity.Employee;
import com.cognizant.employeemanagement.projection.EmployeeNameAndSalary;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    @Query("SELECT new com.cognizant.employeemanagement.dto.EmployeeDTO(e.name, e.salary) " +
           "FROM Employee e WHERE LOWER(e.department.name) = LOWER(:departmentName)")
    List<EmployeeDTO> findEmployeeDTOsByDepartmentName(String departmentName);

    List<EmployeeNameAndSalary> findByDepartment_NameIgnoreCase(String name);

    List<EmployeeCustomProjection> findByDepartment_Name(String name);
}
