package com.bank;

public class BankingTest {
    public static void main(String[] args) {
        // Get the single instance of LoginManager
        LoginManager loginManager = LoginManager.getInstance();
        
        // Create a BankingOperations object with an initial balance of $1000
        BankingOperations bankingOps = new BankingOperations(1000);
        
        // Test: Try to view balance without logging in
        bankingOps.viewBalance();
        
        // Log in the user
        loginManager.logIn();
        
        // View balance after logging in
        bankingOps.viewBalance();
        
        // Deposit money
        bankingOps.deposit(500);
        
        // Withdraw money
        bankingOps.withdraw(200);
        
        // View balance after transactions
        bankingOps.viewBalance();
        
        // Log out the user
        loginManager.logOut();
        
        // Try to perform operations after logging out
        bankingOps.viewBalance();
        bankingOps.deposit(100);
        bankingOps.withdraw(50);
    }
}
