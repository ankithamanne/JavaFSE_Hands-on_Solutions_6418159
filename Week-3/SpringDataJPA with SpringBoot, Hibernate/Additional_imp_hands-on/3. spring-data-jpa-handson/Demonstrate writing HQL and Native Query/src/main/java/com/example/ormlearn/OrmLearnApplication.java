package com.example.ormlearn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.ormlearn.entity.Employee;
import com.example.ormlearn.service.EmployeeService;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        testHQL();
        testNativeQuery();
    }

    private void testHQL() {
        System.out.println("== START HQL ==");
        List<Employee> hqlEmployees = employeeService.getAllPermanentEmployees();
        hqlEmployees.forEach(emp -> {
            System.out.println("Employee ID: " + emp.getId());
            System.out.println("Employee Name: " + emp.getEmp_name());
            System.out.println("Employee Salary: " +
                (emp.getEmp_salary() != null ? emp.getEmp_salary() : "Not Available"));
            System.out.println("-----------------------");
        });
    }

    private void testNativeQuery() {
        System.out.println("== START NATIVE QUERY ==");
        List<Employee> nativeEmployees = employeeService.getAllEmployeesNative();
        nativeEmployees.forEach(emp -> {
            System.out.println("Employee ID: " + emp.getId());
            System.out.println("Employee Name: " + emp.getEmp_name());
            System.out.println("Employee Salary: " + 
                (emp.getEmp_salary() != null ? emp.getEmp_salary() : "Not Available"));
            System.out.println("-----------------------");
        });
        System.out.println("== END NATIVE QUERY ==");
    }
}
