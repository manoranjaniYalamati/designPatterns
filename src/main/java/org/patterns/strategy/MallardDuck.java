package org.patterns.strategy;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyBehaviour = new FlyWithWings();
        this.quackBehaviour = new Silent();
    }
}
