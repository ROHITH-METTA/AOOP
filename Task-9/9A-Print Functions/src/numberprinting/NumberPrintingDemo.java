package numberprinting;

public class NumberPrintingDemo {
    public static void main(String[] args) {
        Thread printTwoThread = new Thread(new PrintTwo());
        Thread printThreeThread = new Thread(new PrintThree());
        Thread printFourThread = new Thread(new PrintFour());
        Thread printFiveThread = new Thread(new PrintFive());
        Thread printNumberThread = new Thread(new PrintNumber());

        printTwoThread.start();
        printThreeThread.start();
        printFourThread.start();
        printFiveThread.start();
        printNumberThread.start();
    }
}
