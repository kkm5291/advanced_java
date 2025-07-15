package thread.start;

public class HelloRunnableMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");
        HelloRunnable helloRunnable = new HelloRunnable();
        // 작업과 스레드를 분리하는 방법임
        Thread thread = new Thread(helloRunnable);
        thread.start();
        System.out.println(Thread.currentThread().getName() + ": main() end");
    }
}
