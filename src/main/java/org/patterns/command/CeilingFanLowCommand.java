package org.patterns.command;

public class CeilingFanLowCommand implements Command {
    String prevSpeed;
    private CeilingFan ceilingFan;
    @Override public String execute() {
        prevSpeed = ceilingFan.getCurrentSpeed();
        return ceilingFan.low();
    }

    @Override public String undo() {
        return ceilingFan.setSpeed(prevSpeed);
    }
}
