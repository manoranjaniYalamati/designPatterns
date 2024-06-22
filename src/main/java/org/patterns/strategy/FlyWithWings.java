package org.patterns.strategy;

public class FlyWithWings implements FlyBehaviour{
    @Override
    public String fly() {
        return "Flying with wings";
    }
}
