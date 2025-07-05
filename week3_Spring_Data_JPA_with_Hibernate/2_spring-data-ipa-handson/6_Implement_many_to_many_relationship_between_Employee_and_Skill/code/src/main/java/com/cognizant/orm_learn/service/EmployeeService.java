package com.cognizant.orm_learn.service;

import com.cognizant.orm_learn.model.Employee;
import com.cognizant.orm_learn.model.Skill;
import com.cognizant.orm_learn.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private SkillService skillService;

    public Employee get(int id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
    }

    public void save(Employee emp) {
        employeeRepository.save(emp);
    }

    @Transactional
    public void addSkillToEmployee(int empId, int skillId) {
        Employee emp = get(empId);                 
        Skill skill = skillService.get(skillId);   
        emp.getSkillList().add(skill);             
        save(emp);                                 
    }
}
