package com.evaluation.patterns.structural.composite;

public class Book implements Item{
    private int price;

    public Book(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
