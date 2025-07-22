package thread.question.section3;
import static thread.util.MyLogger.log;
public class Number4 {
    public static void main(String[] args) {

        Thread threadA = new Thread(new PrintWork("A", 1000L), "Thread-A");
        Thread threadB = new Thread(new PrintWork("B", 500L), "Thread-B");

        threadA.start();
        threadB.start();
    }

    static class PrintWork implements Runnable {

        private static final String PREFIX = "value: ";
        String content;
        Long duration;

        public PrintWork(String content, Long duration) {
            this.content = PREFIX + content;
            this.duration = duration;
        }

        @Override
        public void run() {
            for (int i = 0; i < 6; i++) {
                log(content);
                try {
                    Thread.sleep(duration);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
