public class Consumer implements Runnable {
    private final SharedBuffer sharedBuffer;

    public Consumer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                String message = sharedBuffer.consume();
                System.out.println("Consumed: " + message);
                Thread.sleep(500); // Simulate variable consumption time
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
