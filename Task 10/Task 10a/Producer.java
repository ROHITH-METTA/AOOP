import java.util.Random;

public class Producer implements Runnable {
    private final SharedBuffer sharedBuffer;
    private final Random random = new Random();

    public Producer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                String message = "Message " + i;
                sharedBuffer.produce(message);
                System.out.println("Produced: " + message);
                Thread.sleep(random.nextInt(1000)); // Simulate variable production time
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
