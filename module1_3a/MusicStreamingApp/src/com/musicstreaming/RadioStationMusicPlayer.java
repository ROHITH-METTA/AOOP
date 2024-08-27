package com.musicstreaming;

public class RadioStationMusicPlayer implements MusicPlayer {
    private String stationName;

    public RadioStationMusicPlayer(String stationName) {
        this.stationName = stationName;
    }

    @Override
    public void play() {
        System.out.println("Tuning in to radio station: " + stationName);
    }

    @Override
    public void pause() {
        System.out.println("Pausing radio station: " + stationName);
    }

    @Override
    public void stop() {
        System.out.println("Stopping radio station: " + stationName);
    }
}
