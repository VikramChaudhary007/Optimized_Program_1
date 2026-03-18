package Optimized_Program_1.Employee_Stream_Sorting;   // Package declaration


// Employee class represents an employee entity
public class Employee {

    // Private fields (encapsulation)
    private int id;         // Employee ID
    private String name;    // Employee Name
    private double salary;  // Employee Salary

    // Constructor to initialize an employee object
    public Employee(int id, String name, double salary) {
        this.id = id;         // Set ID
        this.name = name;     // Set name
        this.salary = salary; // Set salary
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Getter for Salary
    public double getSalary() {
        return salary;
    }

    // toString method to display employee details
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}
