package exam.concurrency.guardedblock;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 19.08.12
 * Time: 13:21
 * To change this template use File | Settings | File Templates.
 */
public class Consumer implements Runnable {

    private GuardedBlock guardedBlock;

    public Consumer(GuardedBlock guardedBlock) {
        this.guardedBlock = guardedBlock;
    }

    @Override
    public void run() {
        for (String message = guardedBlock.take(); !GuardedBlock.END.equals(message); message = guardedBlock.take()) {
            System.out.println("Consumer: " + message);
        }
    }
}
