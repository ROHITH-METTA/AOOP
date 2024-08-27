package com.musicstreaming;

public class MusicStreamingTest {
    public static void main(String[] args) {
        // Test Adapter Pattern
        MusicPlayer localFilePlayer = new LocalFileAdapter("song.mp3");
        MusicPlayer onlinePlayer = new OnlineStreamingAdapter("http://streaming.url");
        MusicPlayer radioPlayer = new RadioStationAdapter("Classic FM");

        localFilePlayer.play();
        onlinePlayer.play();
        radioPlayer.play();

        // Test Decorator Pattern
        // Wrap the local file player with decorators
        MusicPlayer decoratedPlayer = new EqualizerDecorator(new VolumeControlDecorator(localFilePlayer));
        
        // Apply features using the decorators
        if (decoratedPlayer instanceof VolumeControlDecorator) {
            ((VolumeControlDecorator) decoratedPlayer).setVolume(10);
        }
        
        if (decoratedPlayer instanceof EqualizerDecorator) {
            ((EqualizerDecorator) decoratedPlayer).setEqualizer("Rock");
        }

        decoratedPlayer.play();
    }
}
