package com.musicstreaming;

public class LocalFileMusicPlayer implements MusicPlayer {
    private String fileName;

    public LocalFileMusicPlayer(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void play() {
        System.out.println("Playing local file: " + fileName);
    }

    @Override
    public void pause() {
        System.out.println("Pausing local file: " + fileName);
    }

    @Override
    public void stop() {
        System.out.println("Stopping local file: " + fileName);
    }
}
