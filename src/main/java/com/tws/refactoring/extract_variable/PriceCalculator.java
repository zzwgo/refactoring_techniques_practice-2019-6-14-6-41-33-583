package com.tws.refactoring.extract_variable;

public class PriceCalculator {
    private static final double FIVE_DISCOUNT=0.05;
    private static final double QUANTITY=500;
    private static final double MIN_COST=100.0;
    private static final double ONE_DISCOUNT=0.1;
    double calculatePrice(int quantity, int itemPrice){
        double discount=quantity * itemPrice - Math.max(0, quantity - QUANTITY) * itemPrice * FIVE_DISCOUNT;
        double shippingCost=Math.min(quantity * itemPrice * ONE_DISCOUNT, MIN_COST);
        return  discount+shippingCost;
    }
    double getPrice(int quantity, int itemPrice) {
        return calculatePrice(quantity,itemPrice);
    }
}
