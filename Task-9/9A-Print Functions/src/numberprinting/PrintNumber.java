package numberprinting;

public class PrintNumber implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 4 != 0 && i % 5 != 0) {
                System.out.println("Number: " + i);
            }
        }
    }
}
