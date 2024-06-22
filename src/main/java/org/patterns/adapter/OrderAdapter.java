package org.patterns.adapter;

public class OrderAdapter implements Adapter{

    public String createOrder(String product) {
        if(Amazon.isProductAvailable(product)) {
            Amazon amazon = new Amazon();
            return amazon.createAmazonOrder(new AmazonOrder("123", "20"));
        }
        else if (Flipkart.isProductAvailable(product)) {
            Flipkart flipkart = new Flipkart();
            return flipkart.createFlipKartOrder(new FlipkartOrder("343", "30"));
        }
        else {
            return "No order placed";
        }

    }
}
