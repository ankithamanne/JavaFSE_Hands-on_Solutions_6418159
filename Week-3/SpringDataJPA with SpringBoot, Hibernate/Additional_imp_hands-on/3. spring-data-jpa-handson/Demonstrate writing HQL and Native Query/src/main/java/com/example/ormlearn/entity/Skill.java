package com.example.ormlearn.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String sk_name;

    // Getters
    public int getId() { return id; }
    public String getSk_name() { return sk_name; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setSk_name(String sk_name) { this.sk_name = sk_name; }
}
