package com.bank;

public class LoginManager {
    // The single instance of LoginManager
    private static LoginManager instance;
    
    // Variable to store user login state
    private boolean isLoggedIn;
    
    // Private constructor to prevent instantiation
    private LoginManager() {
        isLoggedIn = false; // User is initially not logged in
    }
    
    // Method to get the single instance of LoginManager
    public static synchronized LoginManager getInstance() {
        if (instance == null) {
            instance = new LoginManager();
        }
        return instance;
    }
    
    // Method to log in the user
    public void logIn() {
        isLoggedIn = true;
        System.out.println("User logged in.");
    }
    
    // Method to log out the user
    public void logOut() {
        isLoggedIn = false;
        System.out.println("User logged out.");
    }
    
    // Method to check if the user is logged in
    public boolean isLoggedIn() {
        return isLoggedIn;
    }
}
