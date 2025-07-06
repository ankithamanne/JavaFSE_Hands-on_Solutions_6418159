package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.model.Skill;
import com.cognizant.ormlearn.repository.EmployeeRepository;
import com.cognizant.ormlearn.repository.SkillRepository;
import com.cognizant.ormlearn.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class OrmLearnApplication {

    @Autowired
    private static EmployeeRepository employeeRepository;

    @Autowired
    private static SkillRepository skillRepository;

    @Autowired
    private static EmployeeService employeeService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);

        employeeRepository = context.getBean(EmployeeRepository.class);
        skillRepository = context.getBean(SkillRepository.class);
        employeeService = context.getBean(EmployeeService.class);

        Skill java = new Skill();
        java.setName("Java");

        Skill spring = new Skill();
        spring.setName("Spring Boot");

        skillRepository.save(java);
        skillRepository.save(spring);

        Employee e = new Employee();
        e.setName("Ankitha");
        e.setSalary(50000);
        e.setSkillList(Arrays.asList(java, spring));
        employeeRepository.save(e);

        // Use transactional method
        employeeService.printEmployeeSkills(e.getId());
    }
}
