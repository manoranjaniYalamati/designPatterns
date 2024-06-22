package org.patterns.strategy;

public class FlyWithoutWings implements FlyBehaviour{

    @Override
    public String fly() {
        return "I am not flying";
    }
}
