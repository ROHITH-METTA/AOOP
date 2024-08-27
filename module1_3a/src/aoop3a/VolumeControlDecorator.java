package aoop3a;

public class VolumeControlDecorator extends MusicSourceDecorator {
 public VolumeControlDecorator(MusicSource musicSource) {
     super(musicSource);
 }

 @Override
 public void play() {
     super.play();
     adjustVolume();
 }

 private void adjustVolume() {
     System.out.println("Adjusting volume...");
 }
}
