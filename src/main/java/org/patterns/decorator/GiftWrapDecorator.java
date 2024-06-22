package org.patterns.decorator;

public class GiftWrapDecorator extends OrderDecorator{

    public GiftWrapDecorator(Order order) {
        super(order);
    }

    @Override
    public double calculateCost() {
        int giftWrapCost = 30;
        return super.calculateCost() + giftWrapCost;
    }
}
