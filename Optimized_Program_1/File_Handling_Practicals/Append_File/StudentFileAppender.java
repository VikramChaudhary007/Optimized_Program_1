package Optimized_Program_1.File_Handling_Practicals.Append_File;

import java.io.FileWriter;
import java.io.IOException;

// Class to append student details to an existing file
public class StudentFileAppender {

    private String filePath;

    // Constructor to set the file path
    public StudentFileAppender(String filePath) {
        this.filePath = filePath;
    }

    // Method to append a student to the file
    public void appendStudent(Student student) {
        try (FileWriter writer = new FileWriter(filePath, true)) { // true = append mode
            writer.write("\n"); // Add a new line before new student data
            writer.write(student.formatDetails());
            System.out.println("New student data appended successfully to " + filePath);
        } catch (IOException e) {
            System.out.println("Error occurred while writing to file: " + e.getMessage());
        }
    }
}
