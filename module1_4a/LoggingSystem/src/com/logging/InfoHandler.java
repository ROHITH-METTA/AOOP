package com.logging;

public class InfoHandler extends LogHandler {
    @Override
    public void handleRequest(String message) {
        if (message.contains("INFO")) {
            System.out.println("INFO: " + message);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(message);
        }
    }
}
