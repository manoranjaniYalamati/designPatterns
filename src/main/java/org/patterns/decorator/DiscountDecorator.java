package org.patterns.decorator;

public class DiscountDecorator extends OrderDecorator {

    private double discountAmount;

    public DiscountDecorator(Order order, double discountAmount) {
        super(order);
        this.discountAmount = discountAmount;
    }

    @Override public double calculateCost() {
        return super.calculateCost() - discountAmount;
    }
}
