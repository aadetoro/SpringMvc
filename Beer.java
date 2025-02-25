package com.example.myappdemo.Model;

import jakarta.persistence.*;


@Entity
public class Beer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double alcoholContent;

    public Beer(Long id, String name, double alcoholContent) {
        this.id = id;
        this.name = name;
        this.alcoholContent = alcoholContent;
    }

    public Beer() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAlcoholContent() {
        return alcoholContent;
    }

    public void setAlcoholContent(double alcoholContent) {
        this.alcoholContent = alcoholContent;
    }

    // Constructors, Getters, and Setters
}

