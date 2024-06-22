package org.patterns.decorator;

abstract class OrderDecorator implements Order {
    private Order order;

    public OrderDecorator(Order order) {
        this.order = order;
    }

    @Override
    public double calculateCost() {
        return order.calculateCost();
    }
}
