package com.musicstreaming;

public class EqualizerDecorator extends MusicPlayerDecorator {

    public EqualizerDecorator(MusicPlayer decoratedMusicPlayer) {
        super(decoratedMusicPlayer);
    }

    public void setEqualizer(String setting) {
        System.out.println("Setting equalizer to: " + setting);
    }
}
