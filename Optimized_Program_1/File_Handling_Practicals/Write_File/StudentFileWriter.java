package Optimized_Program_1.File_Handling_Practicals.Write_File;

import java.io.FileWriter;
import java.io.IOException;

// Class to handle writing student details to a file
public class StudentFileWriter {

    private String filePath;

    // Constructor to set file path
    public StudentFileWriter(String filePath) {
        this.filePath = filePath;
    }

    // Method to write a student to file
    public void writeStudent(Student student) {
        try (FileWriter writer = new FileWriter(filePath)) {  // Auto-close using try-with-resources
            writer.write("Student Details\n");
            writer.write("-------------------------------\n");
            writer.write(student.formatDetails());

            System.out.println("Student details written successfully to " + filePath);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
