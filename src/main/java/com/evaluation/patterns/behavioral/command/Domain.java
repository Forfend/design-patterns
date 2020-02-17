package com.evaluation.patterns.behavioral.command;

public class Domain {
    public static void main(String[] args) {
        Light light = new Light();
        Music music = new Music();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        Command musicOn = new MusicOnCommand(music);
        Command musicOff = new MusicOffCommand(music);

        lightOn.execute();
        lightOff.execute();
        musicOn.execute();
        musicOff.execute();

    }
}
