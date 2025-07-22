package thread.question.section3;
import static thread.util.MyLogger.log;

public class Number3 {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 6; i++) {
                    log("value: " + i);
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Thread thread = new Thread(runnable, "counter");
        thread.start();
    }
}
