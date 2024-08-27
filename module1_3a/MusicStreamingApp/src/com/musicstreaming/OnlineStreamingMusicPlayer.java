package com.musicstreaming;

public class OnlineStreamingMusicPlayer implements MusicPlayer {
    private String streamUrl;

    public OnlineStreamingMusicPlayer(String streamUrl) {
        this.streamUrl = streamUrl;
    }

    @Override
    public void play() {
        System.out.println("Streaming from: " + streamUrl);
    }

    @Override
    public void pause() {
        System.out.println("Pausing stream from: " + streamUrl);
    }

    @Override
    public void stop() {
        System.out.println("Stopping stream from: " + streamUrl);
    }
}
