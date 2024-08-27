package com.bank;

public class BankingOperations {
    private double balance;
    
    // Constructor
    public BankingOperations(double initialBalance) {
        this.balance = initialBalance;
    }
    
    // Method to view balance
    public void viewBalance() {
        if (LoginManager.getInstance().isLoggedIn()) {
            System.out.println("Current Balance: $" + balance);
        } else {
            System.out.println("Please log in to view balance.");
        }
    }
    
    // Method to deposit money
    public void deposit(double amount) {
        if (LoginManager.getInstance().isLoggedIn()) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited $" + amount);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        } else {
            System.out.println("Please log in to deposit.");
        }
    }
    
    // Method to withdraw money
    public void withdraw(double amount) {
        if (LoginManager.getInstance().isLoggedIn()) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew $" + amount);
            } else {
                System.out.println("Invalid withdrawal amount or insufficient funds.");
            }
        } else {
            System.out.println("Please log in to withdraw.");
        }
    }
}
