package Optimized_Program_1.GroupByMarks;


import java.util.*;
import java.util.stream.*;

// Main class demonstrating Stream API groupingBy usage
public class GroupByMarksMain {

    public static void main(String[] args) {

        // List of students (immutable)
        List<Student> students = List.of(
                new Student(1, "Rahul", 80),
                new Student(2, "Amit", 90),
                new Student(3, "Neha", 80),
                new Student(4, "Priya", 90),
                new Student(5, "Karan", 70)
        );

        // Group students by marks using Stream API
        Map<Integer, List<Student>> groupedStudents = students.stream()
                .collect(Collectors.groupingBy(Student::getMarks));

        // Print grouped students
        groupedStudents.forEach((marks, list) -> {
            System.out.println("Marks: " + marks);
            list.forEach(System.out::println);
            System.out.println();
        });
    }
}
