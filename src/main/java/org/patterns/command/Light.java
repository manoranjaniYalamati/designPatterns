package org.patterns.command;

import static org.patterns.util.Constants.lightOnMessage;

import org.patterns.util.Constants;

public class Light {
    public String on() {
        return lightOnMessage;
    }

    public String off() {
        return Constants.lightOffMessage;
    }
}
