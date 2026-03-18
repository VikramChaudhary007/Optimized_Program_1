package Optimized_Program_1.StudentStream;  // Package declaration – groups related classes together

// Student class represents a student entity
public class Student {

    // Private fields (encapsulation – good OOP practice)
    private int id;       // Student ID
    private String name;  // Student name
    private int marks;    // Student marks

    // Constructor to initialize student object
    public Student(int id, String name, int marks) {
        this.id = id;         // Assign ID
        this.name = name;     // Assign name
        this.marks = marks;   // Assign marks
    }

    // Getter method for ID
    public int getId() {
        return id;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for marks
    public int getMarks() {
        return marks;
    }

    // toString() method to display student details in readable format
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }
}
