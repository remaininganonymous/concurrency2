package classes;

public class BankAccount {
    private int balance;
    private final int accountNumber;

    public BankAccount(int accountNumber, int initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
    }

    public synchronized void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient balance");
        }
    }

    public synchronized int getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
