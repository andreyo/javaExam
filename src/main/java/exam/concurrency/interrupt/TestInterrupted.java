package exam.concurrency.interrupt;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 18.08.12
 * Time: 21:24
 * To change this template use File | Settings | File Templates.
 */
public class TestInterrupted extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println("loop " + i);
                Thread.sleep(1000);
                join(100);
            } catch (InterruptedException e) {
                System.out.println("INTERRUPTED");
                return;
            }
        }
    }

    public static void main(String[] args) {
        TestInterrupted testInterrupted = new TestInterrupted();
        testInterrupted.start();
        testInterrupted.interrupt();
    }
}
