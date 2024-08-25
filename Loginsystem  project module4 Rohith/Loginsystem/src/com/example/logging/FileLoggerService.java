package com.example.logging;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLoggerService implements LoggerService {
    @Override
    public void log(String message) {
        try (PrintWriter out = new PrintWriter(new FileWriter("log.txt", true))) {
            out.println("File Log: " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
