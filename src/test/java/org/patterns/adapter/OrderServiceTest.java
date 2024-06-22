package org.patterns.adapter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OrderServiceTest {

    @Test
    void shouldCreateTableOrder() {
        OrderService orderService = new OrderService();
        String orderMessage = orderService.createOrder("Table");

        Assertions.assertEquals("Amazon order created", orderMessage);
    }

    @Test
    void shouldCreateSocksOrder() {
        OrderService orderService = new OrderService();
        String orderMessage = orderService.createOrder("Socks");

        Assertions.assertEquals("Flipkart order saved", orderMessage);
    }

}