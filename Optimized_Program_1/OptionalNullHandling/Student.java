package Optimized_Program_1.OptionalNullHandling;


// Student class represents a student entity
public class Student {

    // Private fields for encapsulation
    private int id;        // Student ID
    private String name;   // Student Name

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // toString method to display student details
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}
