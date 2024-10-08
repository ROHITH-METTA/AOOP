import java.util.Random;

public class Producer implements Runnable {
    private final BoundedBuffer boundedBuffer;
    private final Random random = new Random();

    public Producer(BoundedBuffer boundedBuffer) {
        this.boundedBuffer = boundedBuffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++) { // Producing 20 messages
                String message = "Message " + i;
                boundedBuffer.produce(message);
                Thread.sleep(random.nextInt(500)); // Simulate variable production time
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
