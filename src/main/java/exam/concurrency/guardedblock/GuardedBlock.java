package exam.concurrency.guardedblock;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 19.08.12
 * Time: 12:57
 * To change this template use File | Settings | File Templates.
 */
public class GuardedBlock {
    public static final String END = "END";

    /**
     * Only one message at time can be put here, producer and consumer must wait each other
     */
    private volatile boolean isEmpty = true;
    private volatile String message;

    public synchronized String take() {
        while (isEmpty) {
            try {
                wait();//releases lock on monitor (this) which was taken by synchronized method
            } catch (InterruptedException e) {//verify condition to make sure that this is our interruption
                System.out.println(e.getMessage());
            }
        }
        isEmpty = true;
        notifyAll();
        return message;
    }

    public synchronized void put(String message) {
        while (!isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {//verify condition
                System.out.println(e.getMessage());
            }
        }
        this.message = message;
        isEmpty = false;
        notifyAll();
    }


    public static void main(String[] args) {
        GuardedBlock guardedBlock = new GuardedBlock();
        //Output stream may not show the real picture, but order in Consumer must be the same
        new Thread(new Producer(guardedBlock)).start();
        new Thread(new Consumer(guardedBlock)).start();
    }
}
