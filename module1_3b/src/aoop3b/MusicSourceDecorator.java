package aoop3b;

public abstract class MusicSourceDecorator implements MusicSource {
 protected MusicSource decoratedMusicSource;

 public MusicSourceDecorator(MusicSource musicSource) {
     this.decoratedMusicSource = musicSource;
 }

 @Override
 public void play() {
     decoratedMusicSource.play();
 }
}
