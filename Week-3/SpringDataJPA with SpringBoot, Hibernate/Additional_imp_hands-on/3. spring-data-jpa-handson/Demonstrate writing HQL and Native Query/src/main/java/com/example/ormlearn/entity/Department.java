package com.example.ormlearn.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dp_id;

    private String dp_name;

    // Getters
    public int getDp_id() { return dp_id; }
    public String getDp_name() { return dp_name; }

    // Setters
    public void setDp_id(int dp_id) { this.dp_id = dp_id; }
    public void setDp_name(String dp_name) { this.dp_name = dp_name; }
}
