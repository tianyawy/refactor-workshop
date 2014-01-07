package com.thoughtworks.secondLesson;

/**
 * Created by twer on 1/7/14.
 */
public class Order {
    protected final double _ItemPrice;
    protected final double _ItemAmount;

    public Order(double itemPrice, double itemAmount) {
        _ItemPrice = itemPrice;
        _ItemAmount = itemAmount;
    }

    public double GetAmount() {
        return _ItemAmount;
    }
}
