package com.logging;

public class DebugHandler extends LogHandler {
    @Override
    public void handleRequest(String message) {
        if (message.contains("DEBUG")) {
            System.out.println("DEBUG: " + message);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(message);
        }
    }
}
