package com.cognizant.ormlearn.service;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public void printEmployeeSkills(Integer id) {
        Employee emp = employeeRepository.findById(id).get();
        System.out.println("Employee: " + emp.getName());
        System.out.println("Skills:");
        emp.getSkillList().forEach(skill -> System.out.println("- " + skill.getName()));
    }

}
