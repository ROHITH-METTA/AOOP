package numberprinting;

public class PrintTwo implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 15; i++) {
            if (i % 2 == 0) {
                System.out.println("Divisible by 2: " + i);
            }
        }
    }
}
