package com.logging;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Logger {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void logMessages() {
        Iterator<Command> iterator = commands.iterator();
        while (iterator.hasNext()) {
            Command command = iterator.next();
            command.execute("INFO: Sample info message");
            command.execute("DEBUG: Sample debug message");
            command.execute("ERROR: Sample error message");
        }
    }
}
