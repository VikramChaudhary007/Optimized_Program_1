package Optimized_Program_1.Multithreading_Practicals.Thread_Synchronization;

// Thread class for withdrawing money from a bank account
public class WithdrawThread extends Thread {

    private BankAccount account;
    private int amount;

    // Constructor to set account and withdrawal amount
    public WithdrawThread(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}
