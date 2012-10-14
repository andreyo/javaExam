package exam.patterns.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 04.06.12
 * Time: 8:17
 * To change this template use File | Settings | File Templates.
 */
public class MyObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("changed! " + arg);
    }
}
