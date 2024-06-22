package org.patterns.decorator;

public class CartOrder implements Order {

    @Override
    public double calculateCost() {
        return 25;
    }
}
