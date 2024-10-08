public class Main {
    public static void main(String[] args) {
        SharedBuffer sharedBuffer = new SharedBuffer(5); // Buffer capacity of 5
        Producer producer = new Producer(sharedBuffer);
        Consumer consumer = new Consumer(sharedBuffer);

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
