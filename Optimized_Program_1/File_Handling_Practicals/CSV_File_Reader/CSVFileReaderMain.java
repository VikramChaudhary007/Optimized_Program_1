package Optimized_Program_1.File_Handling_Practicals.CSV_File_Reader;

// Main class to demonstrate CSV file reading
public class CSVFileReaderMain {

    public static void main(String[] args) {

        // Path to the CSV file
        String filePath = "D:\\Project_TY\\Optimized_Program_1\\File_Handling_Practicals\\CSV_File_Reader\\students.csv";

        // Create CSVFileReader object
        CSVFileReader csvReader = new CSVFileReader(filePath);

        // Read and print CSV file
        csvReader.readCSV();
    }
}
