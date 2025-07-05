package com.example.hibernate;

public class App {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Ankitha");
        emp.setSalary(75000);
        Integer empId = HibernateUtil.addEmployee(emp);
        System.out.println("Employee added with ID: " + empId);
    }
}
