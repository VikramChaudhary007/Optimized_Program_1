package Optimized_Program_1.GroupByMarks;


// Student class represents a student entity
public class Student {

    // Private fields for encapsulation
    private int id;       // Student ID
    private String name;  // Student Name
    private int marks;    // Student Marks

    // Constructor
    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Getter for Marks
    public int getMarks() {
        return marks;
    }

    // toString method to display student details
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }
}
