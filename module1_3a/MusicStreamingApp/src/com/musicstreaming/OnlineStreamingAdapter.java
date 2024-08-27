package com.musicstreaming;

public class OnlineStreamingAdapter implements MusicPlayer {
    private OnlineStreamingMusicPlayer onlineStreamingMusicPlayer;

    public OnlineStreamingAdapter(String streamUrl) {
        onlineStreamingMusicPlayer = new OnlineStreamingMusicPlayer(streamUrl);
    }

    @Override
    public void play() {
        onlineStreamingMusicPlayer.play();
    }

    @Override
    public void pause() {
        onlineStreamingMusicPlayer.pause();
    }

    @Override
    public void stop() {
        onlineStreamingMusicPlayer.stop();
    }
}
