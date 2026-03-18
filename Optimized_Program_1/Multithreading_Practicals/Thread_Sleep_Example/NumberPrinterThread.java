package Optimized_Program_1.Multithreading_Practicals.Thread_Sleep_Example;


// Thread class to print numbers from start to end with a delay
public class NumberPrinterThread extends Thread {

    private int start;       // Start number
    private int end;         // End number
    private long delayMillis; // Delay in milliseconds

    // Constructor to initialize range and delay
    public NumberPrinterThread(int start, int end, long delayMillis) {
        this.start = start;
        this.end = end;
        this.delayMillis = delayMillis;
    }

    // run() method executed by the thread
    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println("Number: " + i);

            try {
                Thread.sleep(delayMillis); // Pause the thread
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}
