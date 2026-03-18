package Optimized_Program_1.File_Handling_Practicals.Read_File;

// Student class represents a student entity
public class Student {

    private int id;
    private String name;
    private String course;
    private String city;

    // Constructor
    public Student(int id, String name, String course, String city) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.city = city;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getCourse() { return course; }
    public String getCity() { return city; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Course: " + course + ", City: " + city;
    }
}
