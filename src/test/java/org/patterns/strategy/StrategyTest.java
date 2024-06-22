package org.patterns.strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StrategyTest {

    @Test
    public void shouldRubberDuckNotFly() {
        Duck rubberDuck = new RubberDuck();
        Assertions.assertEquals("I am not flying", rubberDuck.performFly());
    }

    @Test
    public void shouldMallardDuckFly() {
        Duck mallardDuck = new MallardDuck();
        Assertions.assertEquals("Flying with wings", mallardDuck.performFly());
    }

    @Test
    public void shouldRubberDuckQuack() {
        Duck rubberDuck = new RubberDuck();
        Assertions.assertEquals("I can quack", rubberDuck.performQuack());
    }

    @Test
    public void shouldMallardDuckStaySilent() {
        Duck mallardDuck = new MallardDuck();
        Assertions.assertEquals("I am silent !! I cant quack", mallardDuck.performQuack());
    }
}
