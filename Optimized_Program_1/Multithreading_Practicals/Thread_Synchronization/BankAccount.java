package Optimized_Program_1.Multithreading_Practicals.Thread_Synchronization;

// BankAccount class represents a bank account with balance
public class BankAccount {

    private int balance; // Private balance for encapsulation

    // Constructor to initialize account with initial balance
    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    // synchronized method to deposit money
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance after deposit: " + balance);
    }

    // synchronized method to withdraw money
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Insufficient balance to withdraw: " + amount);
        }
    }

    // Getter for balance (optional)
    public int getBalance() {
        return balance;
    }
}
