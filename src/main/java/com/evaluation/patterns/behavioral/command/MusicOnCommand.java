package com.evaluation.patterns.behavioral.command;

public class MusicOnCommand implements Command{

    private Music music;

    public MusicOnCommand(Music music) {
        this.music = music;
    }

    @Override
    public void execute() {
        music.on();
        music.setVolume(25);
    }
}
