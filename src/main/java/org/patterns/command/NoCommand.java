package org.patterns.command;

public class NoCommand implements Command {
    @Override public String execute() {
        return null;
    }

    @Override public String undo() {
        return null;
    }
}
