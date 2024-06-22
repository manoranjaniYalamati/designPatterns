package org.patterns.command;

public class CeilingFanHighCommand implements Command {
    private CeilingFan ceilingFan;
    private String prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public String execute() {
        prevSpeed = ceilingFan.getCurrentSpeed();
        return ceilingFan.high();
    }

    @Override
    public String undo() {
        return ceilingFan.setSpeed(prevSpeed);
    }
}
