package aoop3b;


public class Main {
 public static void main(String[] args) {
     
     MusicPlayer musicPlayer = new SimpleMusicPlayer();

 
     MusicSource localFile = new LocalFileMusicSource("song.mp3");
     MusicSource equalizerLocalFile = new EqualizerDecorator(localFile);
     MusicSource volumeEqualizerLocalFile = new VolumeControlDecorator(equalizerLocalFile);
     
     System.out.println("Playing Local File:");
     musicPlayer.playMusic(volumeEqualizerLocalFile);
     
     MusicSource onlineService = new OnlineStreamingService("Spotify");
     MusicSource equalizerOnlineService = new EqualizerDecorator(onlineService);
     
     System.out.println("\nPlaying Online Streaming Service:");
     musicPlayer.playMusic(equalizerOnlineService);

     MusicSource radio = new RadioStation("Rock FM");
     MusicSource volumeControlRadio = new VolumeControlDecorator(radio);
     
     System.out.println("\nPlaying Radio Station:");
     musicPlayer.playMusic(volumeControlRadio);
 }
}
