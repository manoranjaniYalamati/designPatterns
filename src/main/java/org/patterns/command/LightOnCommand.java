package org.patterns.command;

public class LightOnCommand implements Command{

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public String execute() {
        return light.on();
    }

    @Override
    public String undo() {
        return light.off();
    }
}
