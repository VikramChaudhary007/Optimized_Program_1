package Optimized_Program_1.File_Handling_Practicals.Read_File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Class to handle reading student details from a file
public class StudentFileReader {

    private String filePath;

    // Constructor to set the file path
    public StudentFileReader(String filePath) {
        this.filePath = filePath;
    }

    // Method to read and print the file
    public void readFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read file line by line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
