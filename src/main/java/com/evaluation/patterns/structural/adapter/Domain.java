package com.evaluation.patterns.structural.adapter;

public class Domain {

    public static void main(String[] args) {
        Biggle biggle = new Biggle();
        Wolf wolf = new Wolf();

        Wolf adapter = new DogAdapter(biggle);

        System.out.println("===Biggle===");
        biggle.bark();

        System.out.println("===Wolf===");
        wolf.howl();

        System.out.println("===Adapter===");
        adapter.howl();

    }
}
