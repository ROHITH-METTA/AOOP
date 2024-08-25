package com.example.logging;

public class ConsoleLoggerService implements LoggerService {
    @Override
    public void log(String message) {
        System.out.println("Console Log: " + message);
    }
}
