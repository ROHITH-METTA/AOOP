package numberprinting;

public class PrintFour implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 15; i++) {
            if (i % 4 == 0) {
                System.out.println("Divisible by 4: " + i);
            }
        }
    }
}
