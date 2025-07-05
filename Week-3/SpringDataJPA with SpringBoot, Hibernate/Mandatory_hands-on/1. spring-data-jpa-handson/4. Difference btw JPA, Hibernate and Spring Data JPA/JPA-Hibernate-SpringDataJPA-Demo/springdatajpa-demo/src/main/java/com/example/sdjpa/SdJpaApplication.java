package com.example.sdjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class SdJpaApplication implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(SdJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Employee e = new Employee();
        e.setId(101);
        e.setName("John");
        e.setSalary(50000);

        employeeRepository.save(e);

        System.out.println("Employee added successfully.");
        System.out.println(e); // <-- This line prints the employee object
    }
}
