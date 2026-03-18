package Optimized_Program_1.Multithreading_Practicals.Thread_Creation;


// Main class to demonstrate creating and running a thread
public class ThreadExampleMain {

    public static void main(String[] args) {

        // Create a thread object to print numbers from 1 to 10
        NumberPrinter printerThread = new NumberPrinter(1, 10);

        // Start the thread
        printerThread.start();

        // Optional: main thread message
        System.out.println("Thread started! Numbers will print concurrently.");
    }
}