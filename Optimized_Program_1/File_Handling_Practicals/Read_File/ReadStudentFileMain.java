package Optimized_Program_1.File_Handling_Practicals.Read_File;

// Main class to read and print student file
public class ReadStudentFileMain {

    public static void main(String[] args) {

        // File path where students.txt is stored
        String filePath = "D:\\Project_TY\\Optimized_Program_1\\File_Handling_Practicals\\Write_File\\students.txt";

        // Create StudentFileReader object
        StudentFileReader reader = new StudentFileReader(filePath);

        // Read and print student file
        reader.readFile();
    }
}
