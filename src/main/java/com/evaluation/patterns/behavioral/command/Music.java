package com.evaluation.patterns.behavioral.command;

public class Music {

    public void on() {
        System.out.println("Turning on music..");
    }

    public void off() {
        System.out.println("Turning off music...");
    }

    public void setVolume(int volume) {
        System.out.println("Setting volume to " + volume);
    }
}
