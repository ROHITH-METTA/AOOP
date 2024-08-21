package com.example.logging;

public class LoggerTest {
    public static void main(String[] args) {
        // Get the single instance of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        
        // Test to see if logger1 and logger2 are the same instance
        if (logger1 == logger2) {
            System.out.println("Logger is a singleton!");
        } else {
            System.out.println("Logger is not a singleton!");
        }
        
        // Log messages
        logger1.log("This is a test message.");
        logger2.log("This is another test message.");
    }
}
