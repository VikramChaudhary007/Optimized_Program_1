package Optimized_Program_1.Mini_Project;


// Employee.java
// Class representing an Employee entity

public class Employee {

    private String name;  // Employee name

    // Constructor
    public Employee(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Override toString() for easy display
    @Override
    public String toString() {
        return name;
    }
}
