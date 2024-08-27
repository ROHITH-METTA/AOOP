package com.musicstreaming;

public class RadioStationAdapter implements MusicPlayer {
    private RadioStationMusicPlayer radioStationMusicPlayer;

    public RadioStationAdapter(String stationName) {
        radioStationMusicPlayer = new RadioStationMusicPlayer(stationName);
    }

    @Override
    public void play() {
        radioStationMusicPlayer.play();
    }

    @Override
    public void pause() {
        radioStationMusicPlayer.pause();
    }

    @Override
    public void stop() {
        radioStationMusicPlayer.stop();
    }
}
