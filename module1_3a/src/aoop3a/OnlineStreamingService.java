package aoop3a;

//OnlineStreamingService.java
public class OnlineStreamingService implements MusicSource {
 private String serviceName;

 public OnlineStreamingService(String serviceName) {
     this.serviceName = serviceName;
 }

 @Override
 public void play() {
     System.out.println("Streaming music from: " + serviceName);
 }
}
