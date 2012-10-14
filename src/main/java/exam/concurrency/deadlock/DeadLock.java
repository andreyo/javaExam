package exam.concurrency.deadlock;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 18.08.12
 * Time: 23:13
 * To change this template use File | Settings | File Templates.
 */
public class DeadLock {
    private static final int SLEEP_MILLISECONDS = 100;
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public static void main(String[] args) {
        final DeadLock deadLock = new DeadLock();
        new Thread(new Runnable() {
            @Override
            public void run() {
                deadLock.lock12();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                deadLock.lock21();
            }
        }).start();
    }

    private void lock12() {
        System.out.println("entered lock12");
        synchronized (lock1) {
            System.out.println("lock12 - lock1");
            sleep();
            synchronized (lock2) {
                System.out.println("lock12 - lock2");
                sleep();
            }
        }
    }

    private void lock21() {
        System.out.println("entered lock21");
        synchronized (lock2) {
            System.out.println("lock21 - lock2");
            sleep();
            synchronized (lock1) {
                System.out.println("lock21 - lock1");
                sleep();
            }
        }
    }

    private void sleep() {
        try {
            Thread.sleep(SLEEP_MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
