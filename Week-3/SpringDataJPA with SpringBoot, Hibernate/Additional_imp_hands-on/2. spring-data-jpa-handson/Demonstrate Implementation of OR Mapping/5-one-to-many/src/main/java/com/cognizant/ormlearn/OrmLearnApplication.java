package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.*;
import com.cognizant.ormlearn.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private SkillRepository skillRepository;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        Department department = new Department();
        department.setName("Engineering");
        departmentRepository.save(department);

        Skill skill1 = new Skill();
        skill1.setName("Java");
        skillRepository.save(skill1);

        Skill skill2 = new Skill();
        skill2.setName("Spring Boot");
        skillRepository.save(skill2);

        List<Skill> skills = new ArrayList<>();
        skills.add(skill1);
        skills.add(skill2);

        Employee employee = new Employee();
        employee.setName("Ankitha");
        employee.setSalary(70000);
        employee.setDepartment(department);
        employee.setSkillList(skills);

        employeeRepository.save(employee);

        // Fetch and display
        Employee savedEmp = employeeRepository.findById(employee.getId()).get();
        System.out.println("Employee: " + savedEmp.getName());
        System.out.println("Skills:");
        savedEmp.getSkillList().forEach(s -> System.out.println("- " + s.getName()));
    }
}