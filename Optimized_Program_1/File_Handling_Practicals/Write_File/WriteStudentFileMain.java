package Optimized_Program_1.File_Handling_Practicals.Write_File;

// Main class to write student details into file
public class WriteStudentFileMain {

    public static void main(String[] args) {

        // Create a student object
        Student student = new Student(101, "Vikram", "BCA", "Palanpur");

        // File path where students.txt will be created
        String filePath = "D:\\Project_TY\\Optimized_Program_1\\File_Handling_Practicals\\Write_File\\students.txt";

        // Create StudentFileWriter object
        StudentFileWriter writer = new StudentFileWriter(filePath);

        // Write student details to file
        writer.writeStudent(student);
    }
}
