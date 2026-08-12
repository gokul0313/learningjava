package routinespractice;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class mythreads {

    public static void Printthread() throws Exception {
        BlockingQueue<String> ch = new LinkedBlockingQueue<>();

        for (int i = 0; i < 5; i++) {
            final int index = i; // must be effectively final to use in lambda

            new Thread(() -> {
                try {
                    ch.put(computesomething(index));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.err.println("Interrupted while putting: " + e);
                }
            }).start();

            String result = ch.take(); // blocks until an item is available
            System.err.println("Result: " + result);
        }
    }

    public static String computesomething(int pInput) {
        long lDuration;
        switch (pInput) {
            case 0:
                lDuration = 1500;
                break;
            case 1:
                lDuration = 2000;
                break;
            case 2:
                lDuration = 3000;
                break;
            case 3:
                lDuration = 5000;
                break;
            case 4:
                lDuration = 1000;
                break;
            default:
                throw new AssertionError();
        }
        try {
            Thread.sleep(lDuration);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Error in method: " + e);
        }
        return "hi " + pInput;
    }

    // public static void main(String[] args) throws Exception {
    //     Printthread();
    // }
}