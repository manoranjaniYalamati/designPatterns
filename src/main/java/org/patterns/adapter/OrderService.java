package org.patterns.adapter;

public class OrderService {

    public String createOrder(String product) {
        OrderAdapter orderAdapter = new OrderAdapter();
       return orderAdapter.createOrder(product);
    }
}
