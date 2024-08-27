package com.musicstreaming;

public class LocalFileAdapter implements MusicPlayer {
    private LocalFileMusicPlayer localFileMusicPlayer;

    public LocalFileAdapter(String fileName) {
        localFileMusicPlayer = new LocalFileMusicPlayer(fileName);
    }

    @Override
    public void play() {
        localFileMusicPlayer.play();
    }

    @Override
    public void pause() {
        localFileMusicPlayer.pause();
    }

    @Override
    public void stop() {
        localFileMusicPlayer.stop();
    }
}
