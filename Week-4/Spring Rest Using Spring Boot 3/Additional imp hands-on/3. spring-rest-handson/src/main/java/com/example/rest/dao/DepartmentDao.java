package com.example.rest.dao;

import com.example.rest.model.Department;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class DepartmentDao {

    public static ArrayList<Department> DEPARTMENT_LIST;

    static {
        ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
        Department dept1 = (Department) context.getBean("dept1");
        Department dept2 = (Department) context.getBean("dept2");

        DEPARTMENT_LIST = new ArrayList<>();
        DEPARTMENT_LIST.add(dept1);
        DEPARTMENT_LIST.add(dept2);
    }

    public ArrayList<Department> getAllDepartments() {
        return DEPARTMENT_LIST;
    }
}
