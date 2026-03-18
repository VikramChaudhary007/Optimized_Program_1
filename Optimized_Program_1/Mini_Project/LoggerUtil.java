package Optimized_Program_1.Mini_Project;

// LoggerUtil.java
// Utility class to write logs to a file

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerUtil {

    // Log file path
    private static final String LOG_FILE = "D:\\Project_TY\\Optimized_Program_1\\Mini_Project\\app.log";

    // Write log message with timestamp
    public static void writeLog(String message) {
        try {
            DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String time = LocalDateTime.now().format(format);

            FileWriter writer = new FileWriter(LOG_FILE, true);
            writer.write(time + " - " + message + "\n");
            writer.close();

        } catch (IOException e) {
            System.out.println("Error writing log.");
        }
    }
}
