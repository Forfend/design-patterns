package com.evaluation.patterns.behavioral.observer;

public class Domain {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addItem("Book");
        shop.addItem("Pen");
        shop.addItem("Magazine");

        Subscriber first = new User("John Doe");
        Subscriber second = new User("Jamie Adams");

        shop.subscribe(first);
        shop.subscribe(second);

        shop.addItem("Laptop");

        shop.removeItem("Laptop");

    }
}
