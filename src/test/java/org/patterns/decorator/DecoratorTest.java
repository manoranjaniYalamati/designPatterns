package org.patterns.decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DecoratorTest {

    @Test
    void shouldCalculateCostWithGiftWrap() {
        double totalCost =
            new DiscountDecorator(new GiftWrapDecorator(new CartOrder()), 5).calculateCost();
        Assertions.assertEquals(50, totalCost);
    }
}
