package org.patterns.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Flipkart {
    public static List<String> availableProducts = new ArrayList<>(Arrays.asList("Car", "Socks"));
    public String createFlipKartOrder(FlipkartOrder order) {
        return "Flipkart order saved";
    }

    public static boolean isProductAvailable(String product) {
        return availableProducts.contains(product);
    }
}
