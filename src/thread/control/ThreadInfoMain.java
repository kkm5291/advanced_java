package thread.control;

import thread.start.HelloRunnable;
import thread.util.MyLogger;

import static thread.util.MyLogger.*;

public class ThreadInfoMain {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread(); // main 스레드
        log("mainThread = " + mainThread);

        // 스레드의 고유 식별자를 반환.
        // 이 아이디는 JVM 내에서 고유함
        log("mainThread.threadId() = " + mainThread.threadId());
        log("mainThread.getName() = " + mainThread.getName());

        // 스레드 우선순위 반환 1 (가장 낮음) 10 (가장 높음) 설정 가능함.
        // 그러나 운영체제에서 스케줄러를 관리하기 때문에 그냥 희망사항 정도로 생각하면 됨
        log("mainThread.getPriority() = " + mainThread.getPriority());

        // 스레드 그룹을 반화남. 스레드를 그룹화하여 관리할 수 있는 기능을 제공함
        // 근데 많이 안씀
        log("mainThread.getThreadGroup() = " + mainThread.getThreadGroup());

        // NEW(스레드가 아직 실행되지 않은 상태)                   (생성)
        // RUNNABLE(스레드가 실행 중이거나 실행될 준비가 된 상태)    (실행 가능)
        // BLOCKED (스레드가 동기화 락을 기다리는 상태)             (일시 중지)
        // WAITING (스레드가 다른 스레드의 작업을 기다리는 상태)      (일시 중지)
        // TIMED_WAITING (일정 시간 동안 기다리는 상태)            (일시 중지)
        // TERMINATED (스레드가 일을 마친 상태)                   (종료)
        log("mainThread.getState() = " + mainThread.getState());

        // myThread 스레드
        Thread myThread = new Thread(new HelloRunnable(), "myThread");
        log("myThread = " + myThread);
        log("myThread.threadId() = " + myThread.threadId());
        log("myThread.getName() = " + myThread.getName());
        log("myThread.getPriority() = " + myThread.getPriority());
        log("myThread.getThreadGroup() = " + myThread.getThreadGroup());
        log("myThread.getState() = " + myThread.getState());
    }
}
