import java.util.LinkedList;
import java.util.Queue;

public class BoundedBuffer {
    private final Queue<String> queue = new LinkedList<>();
    private final int capacity;

    public BoundedBuffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(String message) throws InterruptedException {
        while (queue.size() == capacity) {
            wait(); // Wait until space is available
        }
        queue.add(message);
        System.out.println("Produced: " + message);
        notifyAll(); // Notify consumers that a new message is available
    }

    public synchronized String consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait(); // Wait until a message is available
        }
        String message = queue.poll();
        System.out.println("Consumed: " + message);
        notifyAll(); // Notify producers that space is available
        return message;
    }
}
