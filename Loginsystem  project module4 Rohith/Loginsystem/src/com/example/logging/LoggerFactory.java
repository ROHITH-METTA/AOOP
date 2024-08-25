package com.example.logging;

public class LoggerFactory {
    public static LoggerService getLoggerService(String type) {
        switch (type) {
            case "console":
                return new ConsoleLoggerService();
            case "file":
                return new FileLoggerService();
            default:
                return new ConsoleLoggerService();
        }
    }
}
