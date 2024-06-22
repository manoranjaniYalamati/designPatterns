package org.patterns.strategy;

public class Quack implements QuackBehaviour{

    @Override
    public String quack() {
        return "I can quack";
    }
}
