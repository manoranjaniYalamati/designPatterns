package org.patterns.command;

public class RemoteControlWithUndo {

    Command command;

    public RemoteControlWithUndo() {
        command = new NoCommand();
    }

    RemoteControlWithUndo(Command command) {
        this.command = command;
    }

    public String onOrOffbuttonWasPressed() {
       return  command.execute();
    }

    public String undoButtonPressed() {
        return command.undo();
    }
}
