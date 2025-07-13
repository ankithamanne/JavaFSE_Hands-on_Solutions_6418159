package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.model.Skill;
import com.cognizant.ormlearn.repository.DepartmentRepository;
import com.cognizant.ormlearn.repository.EmployeeRepository;
import com.cognizant.ormlearn.repository.SkillRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {

    private static EmployeeRepository employeeRepository;
    private static DepartmentRepository departmentRepository;
    private static SkillRepository skillRepository;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);

        employeeRepository = context.getBean(EmployeeRepository.class);
        departmentRepository = context.getBean(DepartmentRepository.class);
        skillRepository = context.getBean(SkillRepository.class);

        Department d = new Department();
        d.setName("IT");
        departmentRepository.save(d);

        Skill java = new Skill();
        java.setName("Java");
        skillRepository.save(java);

        Employee e = new Employee();
        e.setName("Ankitha");
        e.setSalary(50000);
        e.setDepartment(d);
        e.setSkillList(List.of(java));
        employeeRepository.save(e);

        System.out.println("✅ Employee Added: " + e);
        System.out.println("✅ Department: " + d);
        System.out.println("✅ Skills: " + e.getSkillList());
    }
}
