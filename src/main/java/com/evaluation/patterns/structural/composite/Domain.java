package com.evaluation.patterns.structural.composite;

public class Domain {
    public static void main(String[] args) {
        Box box = new Box();

        Item phone = new Phone(1000);
        Item book = new Book(10);

        box.addItem(phone);
        box.addItem(book);

        System.out.println(box.getSum());
    }
}
