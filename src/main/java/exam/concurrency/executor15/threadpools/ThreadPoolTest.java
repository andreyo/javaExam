package exam.concurrency.executor15.threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 19.08.12
 * Time: 14:22
 * To change this template use File | Settings | File Templates.
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        ExecutorService executorService2 = Executors.newScheduledThreadPool(10);
        ExecutorService executorService3 = Executors.newCachedThreadPool();
    }
}
