package org.patterns.command;

import static org.patterns.util.Constants.HIGH;
import static org.patterns.util.Constants.LOW;
import static org.patterns.util.Constants.MEDIUM;
import static org.patterns.util.Constants.OFF;

import org.patterns.factory.abstractFactory.SlicedPepperoni;

public class CeilingFan {
    private String speed;


    public String high() {
        speed = HIGH;
        return "High speed";
    }

    public String getCurrentSpeed() {
        return speed;
    }

    public String low() {
        speed = LOW;
        return speed;
    }

    public String medium() {
        speed = MEDIUM;
        return speed;
    }

    public String off() {
        speed = OFF;
        return speed;
    }

    public String setSpeed(String prevSpeed) {
        switch (prevSpeed) {
            case LOW -> speed = LOW;
            case MEDIUM -> speed = MEDIUM;
            case HIGH -> speed = HIGH;
            default -> speed = OFF;
        }
        return prevSpeed;
    }
}
