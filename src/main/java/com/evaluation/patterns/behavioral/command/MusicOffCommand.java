package com.evaluation.patterns.behavioral.command;

public class MusicOffCommand implements Command {

    private Music music;

    public MusicOffCommand(Music music) {
        this.music = music;
    }

    @Override
    public void execute() {
        music.off();
    }
}
