package com.evaluation.patterns.structural.composite;

public class Phone implements Item {

    private int price;

    public Phone(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
