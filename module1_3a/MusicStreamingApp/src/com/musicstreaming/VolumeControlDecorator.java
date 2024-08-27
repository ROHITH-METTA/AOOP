package com.musicstreaming;

public class VolumeControlDecorator extends MusicPlayerDecorator {

    public VolumeControlDecorator(MusicPlayer decoratedMusicPlayer) {
        super(decoratedMusicPlayer);
    }

    public void setVolume(int level) {
        System.out.println("Setting volume to: " + level);
    }
}
