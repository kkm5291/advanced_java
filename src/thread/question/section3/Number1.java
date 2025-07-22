package thread.question.section3;

import static thread.util.MyLogger.log;

public class Number1 {

    public static void main(String[] args) {
        CounterThread counterThread = new CounterThread();
        counterThread.start();
    }

    static class CounterThread extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                log("value: " + i);
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
