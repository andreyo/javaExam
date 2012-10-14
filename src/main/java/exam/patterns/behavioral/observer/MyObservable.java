package exam.patterns.behavioral.observer;

import java.util.Observable;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 04.06.12
 * Time: 8:16
 * To change this template use File | Settings | File Templates.
 */
public class MyObservable extends Observable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        setChanged();
        notifyObservers(name);
    }

    public static void main(String[] args) {
        MyObservable myObservable = new MyObservable();
        MyObserver observer = new MyObserver();
        myObservable.addObserver(observer);

        myObservable.setName("new name");
    }
}
