package Bai2_5;

public class Account {
    private String id;
    private String name;
    private double balance;

    // Constructor that accepts ID, name, and balance
    public Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Constructor that accepts ID and name, sets balance to 0
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0.0; // Default balance
    }

    // Getter methods
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    // Method to credit the account (add money)
    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid credit amount");
        }
    }

    // Method to debit the account (subtract money)
    public void debit(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid debit amount or insufficient balance");
        }
    }

    // Method to transfer money to another account
    public void transferTo(Account another, double amount) {
        if (amount > 0 && amount <= balance) {
            this.debit(amount);  // Debit from this account
            another.credit(amount);  // Credit to the other account
        } else {
            System.out.println("Invalid transfer amount or insufficient balance");
        }
    }

    // toString method to print account details
    @Override
    public String toString() {
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}


