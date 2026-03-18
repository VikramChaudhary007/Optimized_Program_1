package Optimized_Program_1.Multithreading_Practicals.Thread_Synchronization;

// Main class to demonstrate thread synchronization
public class BankAccountMain {

    public static void main(String[] args) {

        // Create a shared BankAccount object with initial balance 1000
        BankAccount account = new BankAccount(1000);

        // Create threads for deposit and withdraw
        DepositThread depositThread = new DepositThread(account, 500);
        WithdrawThread withdrawThread = new WithdrawThread(account, 300);

        // Start threads
        depositThread.start();
        withdrawThread.start();
    }
}
