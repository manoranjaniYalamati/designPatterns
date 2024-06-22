package org.patterns.strategy;

public class Silent implements QuackBehaviour{

    @Override
    public String quack() {
        return "I am silent !! I cant quack";
    }
}
