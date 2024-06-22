package org.patterns.adapter;


public class AmazonOrder {
    String orderId;
    String cost;

    public AmazonOrder(String orderId, String cost) {
        this.orderId = orderId;
        this.cost = cost;
    }
}
