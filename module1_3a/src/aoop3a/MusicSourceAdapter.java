package aoop3a;


public class MusicSourceAdapter implements MusicSource {
 private MusicSource musicSource;

 public MusicSourceAdapter(MusicSource musicSource) {
     this.musicSource = musicSource;
 }

 @Override
 public void play() {
     musicSource.play();
 }
}
