package exam.concurrency.guardedblock.bookexample;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 19.08.12
 * Time: 15:18
 * To change this template use File | Settings | File Templates.
 */
class A extends Thread {
    int count = 0;

    public void run() {
        System.out.println("run");
        synchronized (this) {
            for (int i = 0; i < 50; i++) {
                count = count + i;
            }
            notifyAll();
        }
    }
}


public class Example extends Thread {
    A a;

    public Example(A a) {
        this.a = a;
    }

    public static void main(String argv[]) {
        A a = new A();
        Example t1 = new Example(a);
        Example t2 = new Example(a);
        t1.start();
        t2.start();
        a.start();
    }

    public void run() {
        synchronized (a) {
            System.out.println("waiting");
            try {
                a.wait();
            } catch (InterruptedException e) {

            }
            System.out.println(a.count);

        }
    }

}
