package Optimized_Program_1.Multithreading_Practicals.Thread_Sleep_Example;

// Main class to demonstrate Thread.sleep() with a number printing thread
public class ThreadSleepMain {

    public static void main(String[] args) {

        // Create thread to print numbers from 1 to 5 with 1-second delay
        NumberPrinterThread printerThread = new NumberPrinterThread(1, 5, 1000);

        // Start the thread
        printerThread.start();

        System.out.println("Thread started! Numbers will print with 1-second delay.");
    }
}