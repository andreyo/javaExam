package exam.concurrency.lock15;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 19.08.12
 * Time: 14:03
 * To change this template use File | Settings | File Templates.
 */
public class LockTest {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        lock.lock();
        lock.tryLock();
        lock.unlock();

        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        readWriteLock.readLock();
        readWriteLock.writeLock();
    }
}
