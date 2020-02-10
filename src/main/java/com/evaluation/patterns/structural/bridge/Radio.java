package com.evaluation.patterns.structural.bridge;

public class Radio implements Device {

    @Override
    public void turnOn() {
        System.out.println("Turning on the radio...");
    }

    @Override
    public void changeChanel() {
        System.out.println("Changed radio channel...");
    }

    @Override
    public void changeVolume() {
        System.out.println("Radio volume changed...");
    }
}
