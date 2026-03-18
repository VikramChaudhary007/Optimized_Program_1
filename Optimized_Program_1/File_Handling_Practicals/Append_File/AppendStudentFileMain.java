package Optimized_Program_1.File_Handling_Practicals.Append_File;

// Main class to append a student to students.txt
public class AppendStudentFileMain {

    public static void main(String[] args) {

        // Create a new student object
        Student student = new Student(102, "Priya", "BCA", "Surat");

        // Path of the file to append
        String filePath = "D:\\Project_TY\\Optimized_Program_1\\File_Handling_Practicals\\Write_File\\students.txt";

        // Create appender object
        StudentFileAppender appender = new StudentFileAppender(filePath);

        // Append the student to the file
        appender.appendStudent(student);
    }
}
