package org.patterns.factory.abstractFactory;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PizzaTest {

    @Test
    void shouldCreateCheeseNYPizza() {
        PizzaStore nyPizzaStore = new NYPizzaStore();

        Pizza cheesePizza = nyPizzaStore.orderPizza("cheese");

        Assertions.assertTrue(cheesePizza instanceof CheesePizza);
        Assertions.assertTrue(cheesePizza.cheese instanceof  ReggianoCheese);
    }

    @Test
    void shouldCreateClamNYPizza() {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza clamPizza = pizzaStore.orderPizza("clam");

        Assertions.assertTrue(clamPizza instanceof ClamPizza);
        Assertions.assertTrue(clamPizza.clam instanceof  FreshClams);
    }

    @Test
    void shouldCreateVeggieChicagoPizza() {
        PizzaStore chicaoPizzaStore = new ChicagoPizzaStore();
        Pizza veggiePizza = chicaoPizzaStore.orderPizza("veggie");

        Assertions.assertTrue(veggiePizza instanceof VeggiePizza);
        Assertions.assertEquals(1, Arrays.stream(veggiePizza.veggies)
                                         .filter(veggies -> veggies instanceof BlackOlives).count());
    }

}