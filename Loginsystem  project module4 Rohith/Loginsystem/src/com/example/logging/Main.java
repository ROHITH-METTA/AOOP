package com.example.logging;

public class Main {
    public static void main(String[] args) {
        // Choose the logging framework
        LoggerService loggerService = LoggerFactory.getLoggerService("console"); // or "file"

        // Inject it into the application
        Application app = new Application(loggerService);
        app.run();
    }
}
