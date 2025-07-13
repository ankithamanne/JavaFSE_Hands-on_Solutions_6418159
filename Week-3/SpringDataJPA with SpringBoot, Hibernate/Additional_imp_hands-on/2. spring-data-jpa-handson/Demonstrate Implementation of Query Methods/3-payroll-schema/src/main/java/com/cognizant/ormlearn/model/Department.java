package com.cognizant.ormlearn.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dp_id")
    private int id;

    @Column(name = "dp_name")
    private String name;

    @OneToMany(mappedBy = "department")
    private List<Employee> employeeList;

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Department [id=" + id + ", name=" + name + "]";
    }
}
