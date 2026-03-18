package Optimized_Program_1.Multithreading_Practicals.Multiple_Threads;

// NumberThread class extends Thread to print numbers in a given pattern
public class NumberThread extends Thread {

    private int start;       // Start number
    private int end;         // End number
    private boolean printEven; // Flag to indicate even or odd numbers

    // Constructor
    public NumberThread(int start, int end, boolean printEven) {
        this.start = start;
        this.end = end;
        this.printEven = printEven;
    }

    // run() method contains the code executed by the thread
    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (printEven && i % 2 == 0) {
                System.out.println("Even Number: " + i);
            } else if (!printEven && i % 2 != 0) {
                System.out.println("Odd Number: " + i);
            }
        }
    }
}