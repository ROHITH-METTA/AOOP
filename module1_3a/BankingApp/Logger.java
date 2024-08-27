package com.example.logging;

public class Logger {
    // The sole instance of the Logger class
    private static Logger instance;
    
    // Private constructor to prevent instantiation
    private Logger() {}
    
    // Method to get the single instance of the Logger
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    
    // Method to log messages
    public void log(String message) {
        // For simplicity, we're just printing to the console.
        System.out.println("Log: " + message);
    }
}
