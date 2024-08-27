package aoop3a;

public class Main {
 public static void main(String[] args) {
     // Using Local File Music Source
     MusicSource localFile = new LocalFileMusicSource("song.mp3");
     MusicSourceAdapter localFileAdapter = new MusicSourceAdapter(localFile);
     MusicSource equalizerLocalFile = new EqualizerDecorator(localFileAdapter);
     MusicSource volumeEqualizerLocalFile = new VolumeControlDecorator(equalizerLocalFile);
     
     System.out.println("Playing Local File:");
     volumeEqualizerLocalFile.play();
     
     // Using Online Streaming Service
     MusicSource onlineService = new OnlineStreamingService("Spotify");
     MusicSourceAdapter onlineServiceAdapter = new MusicSourceAdapter(onlineService);
     MusicSource equalizerOnlineService = new EqualizerDecorator(onlineServiceAdapter);
     
     System.out.println("\nPlaying Online Streaming Service:");
     equalizerOnlineService.play();

     // Using Radio Station
     MusicSource radio = new RadioStation("Rock FM");
     MusicSourceAdapter radioAdapter = new MusicSourceAdapter(radio);
     MusicSource volumeControlRadio = new VolumeControlDecorator(radioAdapter);
     
     System.out.println("\nPlaying Radio Station:");
     volumeControlRadio.play();
 }
}
