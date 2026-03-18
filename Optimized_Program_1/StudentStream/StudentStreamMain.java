package Optimized_Program_1.StudentStream;     // Same package as Student.java

import java.util.*; // Import utility classes like List, ArrayList, Optional, Comparator

// Main class to demonstrate Stream API operations on Student objects
public class StudentStreamMain {

    public static void main(String[] args) {

        // Create an ArrayList to store Student objects
        List<Student> students = new ArrayList<>();

        // Adding student objects to the list
        students.add(new Student(1, "Rahul", 85));
        students.add(new Student(2, "Amit", 60));
        students.add(new Student(3, "Neha", 75));
        students.add(new Student(4, "Priya", 90));
        students.add(new Student(5, "Karan", 65));

        // 1. Print all students using Stream API
        System.out.println("All Students:");
        students.stream()           // Convert list to Stream
                .forEach(System.out::println); // Print each student (method reference)

        // 2. Filter students with marks greater than 70
        System.out.println("\nStudents with marks > 70:");
        students.stream()                   // Convert list to Stream
                .filter(s -> s.getMarks() > 70) // Filter students where marks > 70
                .forEach(System.out::println); // Print filtered students

        // 3. Find the student with the highest marks
        Optional<Student> topStudent = students.stream()               // Stream of students
                .max(Comparator.comparingInt(Student::getMarks));    // Find max by marks

        System.out.println("\nTop Student:");
        topStudent.ifPresent(System.out::println); // Print top student if present

        // 4. Count total number of students
        long count = students.stream()   // Stream of students
                .count();               // Count number of elements
        System.out.println("\nTotal Students: " + count); // Display count
    }
}
