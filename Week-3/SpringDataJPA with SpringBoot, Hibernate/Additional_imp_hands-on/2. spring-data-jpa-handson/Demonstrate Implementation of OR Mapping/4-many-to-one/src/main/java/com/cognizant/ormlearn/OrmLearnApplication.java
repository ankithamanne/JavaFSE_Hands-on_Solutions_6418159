package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.repository.DepartmentRepository;
import com.cognizant.ormlearn.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {

    private static EmployeeRepository employeeRepository;
    private static DepartmentRepository departmentRepository;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);

        employeeRepository = context.getBean(EmployeeRepository.class);
        departmentRepository = context.getBean(DepartmentRepository.class);

        System.out.println("\n✅ Inserting Department and Employees");

        Department d = new Department();
        d.setName("IT");
        departmentRepository.save(d);

        Employee e1 = new Employee();
        e1.setName("Ankitha");
        e1.setSalary(50000);
        e1.setDepartment(d);
        employeeRepository.save(e1);

        Employee e2 = new Employee();
        e2.setName("Ravi");
        e2.setSalary(30000);
        e2.setDepartment(d);
        employeeRepository.save(e2);

        System.out.println("\n✅ Employees with salary > 30000:");
        List<Employee> highEarners = employeeRepository.findBySalaryGreaterThan(30000);
        highEarners.forEach(System.out::println);

        System.out.println("\n✅ Employees in IT Department:");
        List<Employee> deptEmployees = employeeRepository.findByDepartmentId(d.getId());
        deptEmployees.forEach(System.out::println);
    }
}
