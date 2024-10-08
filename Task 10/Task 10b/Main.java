public class Main {
    public static void main(String[] args) {
        BoundedBuffer boundedBuffer = new BoundedBuffer(10); // Buffer capacity of 10
        Producer producer = new Producer(boundedBuffer);
        Consumer consumer = new Consumer(boundedBuffer);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
