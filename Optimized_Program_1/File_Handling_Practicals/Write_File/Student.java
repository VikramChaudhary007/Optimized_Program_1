package Optimized_Program_1.File_Handling_Practicals.Write_File;

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

    // Format student details as a string
    public String formatDetails() {
        return "ID: " + id + "\n" +
               "Name: " + name + "\n" +
               "Course: " + course + "\n" +
               "City: " + city + "\n";
    }
}
