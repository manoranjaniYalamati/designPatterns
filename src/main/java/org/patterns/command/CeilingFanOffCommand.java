package org.patterns.command;

public class CeilingFanOffCommand implements Command{
    private CeilingFan ceilingFan;
    private String prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override public String execute() {
        prevSpeed = ceilingFan.getCurrentSpeed();
        return ceilingFan.off();
    }

    @Override public String undo() {
        return ceilingFan.setSpeed(prevSpeed);
    }
}
