package exam.concurrency.guardedblock;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 19.08.12
 * Time: 13:21
 * To change this template use File | Settings | File Templates.
 */
public class Producer implements Runnable {

    private GuardedBlock guardedBlock;

    public static final String[] messages = new String[]{"1 line", "2 line", "3 line", "4 line", GuardedBlock.END};

    public Producer(GuardedBlock guardedBlock) {
        this.guardedBlock = guardedBlock;
    }

    @Override
    public void run() {
        for (String message : messages) {
            guardedBlock.put(message);
            System.out.println("Producer: " + message);
        }
    }
}
