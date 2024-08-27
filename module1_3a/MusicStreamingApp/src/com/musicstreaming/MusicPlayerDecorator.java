package com.musicstreaming;

public abstract class MusicPlayerDecorator implements MusicPlayer {
    protected MusicPlayer decoratedMusicPlayer;

    public MusicPlayerDecorator(MusicPlayer decoratedMusicPlayer) {
        this.decoratedMusicPlayer = decoratedMusicPlayer;
    }

    @Override
    public void play() {
        decoratedMusicPlayer.play();
    }

    @Override
    public void pause() {
        decoratedMusicPlayer.pause();
    }

    @Override
    public void stop() {
        decoratedMusicPlayer.stop();
    }
}
