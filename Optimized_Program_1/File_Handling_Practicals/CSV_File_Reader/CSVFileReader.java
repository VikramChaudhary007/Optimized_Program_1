package Optimized_Program_1.File_Handling_Practicals.CSV_File_Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Class to read data from a CSV file
public class CSVFileReader {

    private String filePath;

    // Constructor to set the CSV file path
    public CSVFileReader(String filePath) {
        this.filePath = filePath;
    }

    // Method to read and print all records from the CSV file
    public void readCSV() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) { // Auto-close

            String line;

            // Read each line until end of file
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Print each record
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
    }
}
