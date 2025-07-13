package com.example.rest.dao;

import com.example.rest.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.ArrayList;

public class EmployeeDaoTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
        ArrayList<Employee> employees = (ArrayList<Employee>) context.getBean("employeeList");

        for (Employee emp : employees) {
            System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getDepartment().getName());
        }
    }
}
