package com.logging;

public class ErrorHandler extends LogHandler {
    @Override
    public void handleRequest(String message) {
        if (message.contains("ERROR")) {
            System.out.println("ERROR: " + message);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(message);
        }
    }
}
