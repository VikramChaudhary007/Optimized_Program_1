package Optimized_Program_1.Multithreading_Practicals.Multiple_Threads;

// Main class to demonstrate running multiple threads
public class MultipleThreadsMain {

    public static void main(String[] args) {

        // Create thread to print even numbers from 1 to 10
        NumberThread evenThread = new NumberThread(1, 10, true);

        // Create thread to print odd numbers from 1 to 10
        NumberThread oddThread = new NumberThread(1, 10, false);

        // Start both threads
        evenThread.start();
        oddThread.start();

        // Optional: message from main thread
        System.out.println("Even and Odd threads started concurrently.");
    }
}
