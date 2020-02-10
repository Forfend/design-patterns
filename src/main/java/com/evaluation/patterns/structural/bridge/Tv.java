package com.evaluation.patterns.structural.bridge;

public class Tv implements Device{

    @Override
    public void turnOn() {
        System.out.println("Turning on the TV...");
    }

    @Override
    public void changeChanel() {
        System.out.println("Changed tv chanel...");
    }

    @Override
    public void changeVolume() {
        System.out.println("Tv volume changed...");
    }
}
