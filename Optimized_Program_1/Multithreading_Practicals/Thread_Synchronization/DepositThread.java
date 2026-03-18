package Optimized_Program_1.Multithreading_Practicals.Thread_Synchronization;


// Thread class for depositing money into a bank account
public class DepositThread extends Thread {

    private BankAccount account;
    private int amount;

    // Constructor to set account and deposit amount
    public DepositThread(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.deposit(amount);
    }
}
