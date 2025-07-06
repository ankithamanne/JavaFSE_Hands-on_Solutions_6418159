package com.cognizant.ormlearn.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "skill")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sk_id")
    private int id;

    @Column(name = "sk_name")
    private String name;

    @ManyToMany(mappedBy = "skillList")
    private List<Employee> employeeList;

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Skill [id=" + id + ", name=" + name + "]";
    }
}
