package aoop3b;

//RadioStation.java
public class RadioStation implements MusicSource {
 private String stationName;

 public RadioStation(String stationName) {
     this.stationName = stationName;
 }

 @Override
 public void play() {
     System.out.println("Playing music from radio station: " + stationName);
 }
}
