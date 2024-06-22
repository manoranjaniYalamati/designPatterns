package org.patterns.strategy;

public class RubberDuck extends Duck {
    public RubberDuck() {
        this.flyBehaviour = new FlyWithoutWings();
        this.quackBehaviour = new Quack();
    }
}
