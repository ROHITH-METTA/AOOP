package numberprinting;

public class PrintThree implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 15; i++) {
            if (i % 3 == 0) {
                System.out.println("Divisible by 3: " + i);
            }
        }
    }
}
