package com.example.ormlearn.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String emp_name;
    private Double emp_salary; // Using Wrapper to avoid NPE

    @ManyToOne
    @JoinColumn(name = "dp_id")
    private Department department;

    @ManyToMany
    @JoinTable(name = "employee_skill", 
        joinColumns = @JoinColumn(name = "emp_id"), 
        inverseJoinColumns = @JoinColumn(name = "sk_id"))
    private List<Skill> skills; // Renamed for consistency

    // Getters
    public int getId() { return id; }
    public String getEmp_name() { return emp_name; }
    public Double getEmp_salary() { return emp_salary; }
    public Department getDepartment() { return department; }
    public List<Skill> getSkills() { return skills; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setEmp_name(String emp_name) { this.emp_name = emp_name; }
    public void setEmp_salary(Double emp_salary) { this.emp_salary = emp_salary; }
    public void setDepartment(Department department) { this.department = department; }
    public void setSkills(List<Skill> skills) { this.skills = skills; }
}
