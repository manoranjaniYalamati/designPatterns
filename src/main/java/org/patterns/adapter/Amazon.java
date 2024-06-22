package org.patterns.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Amazon {
    public static List<String> availableProducts = new ArrayList<>(Arrays.asList("Table", "Pen"));
    public String  createAmazonOrder(AmazonOrder order) {
        return "Amazon order created";
    }

    public static boolean isProductAvailable(String product) {
        return availableProducts.contains(product);
    }
}
