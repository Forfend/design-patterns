package com.evaluation.patterns.creational.prototype;

public class Domain {

    public static void main(String[] args) {
        Cat cat = new Cat("Johnny", 1);
        Cat copy = cat.copy();

        System.out.println(cat);
        System.out.println(copy);
    }
}
