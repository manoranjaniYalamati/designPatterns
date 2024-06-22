package org.patterns.command;

public class CeilingFanMediumCommand implements Command{
    private CeilingFan ceilingFan;
    private String prevSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override public String execute() {
        prevSpeed = ceilingFan.getCurrentSpeed();
        return ceilingFan.medium();
    }

    @Override public String undo() {
        return ceilingFan.setSpeed(prevSpeed);
    }
}
