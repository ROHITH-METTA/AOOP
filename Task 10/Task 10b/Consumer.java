public class Consumer implements Runnable {
    private final BoundedBuffer boundedBuffer;

    public Consumer(BoundedBuffer boundedBuffer) {
        this.boundedBuffer = boundedBuffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++) { // Consuming 20 messages
                boundedBuffer.consume();
                Thread.sleep(700); // Simulate variable consumption time
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
