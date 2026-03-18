package Optimized_Program_1.OptionalNullHandling;

import java.util.Optional;

// Main class to demonstrate Optional and null handling
public class OptionalNullMain {

    public static void main(String[] args) {

        // Student object (can be null)
        Student student = null;

        // Wrap the student object using Optional
        Optional<Student> optionalStudent = Optional.ofNullable(student);

        // Print student if present, otherwise print a default message
        optionalStudent.ifPresentOrElse(
                System.out::println,                    // Print student if present
                () -> System.out.println("Student object is null.") // Default message
        );

        // Optional enhancement: provide a default Student if null
        Student defaultStudent = optionalStudent.orElse(new Student(0, "Default Student"));
        System.out.println("Using default if null: " + defaultStudent);
    }
}
