package com.example.logging;

public class Application {
    private final LoggerService loggerService;

    public Application(LoggerService loggerService) {
        this.loggerService = loggerService;
    }

    public void run() {
        loggerService.log("This is a log message.");
    }
}
