package org.patterns.strategy;

public class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public String performFly() {
        return flyBehaviour.fly();
    }

    public String performQuack() {
        return quackBehaviour.quack();
    }
}
