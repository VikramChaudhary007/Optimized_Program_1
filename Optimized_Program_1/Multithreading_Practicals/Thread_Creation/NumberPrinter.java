package Optimized_Program_1.Multithreading_Practicals.Thread_Creation;

// NumberPrinter class extends Thread to execute code concurrently
public class NumberPrinter extends Thread {

    private int start;  // Start number
    private int end;    // End number

    // Constructor to initialize range
    public NumberPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    // run() method contains the code executed by the thread
    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println("Number: " + i);
        }
    }
}
