package exam.patterns.behavioral.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 14.10.12
 * Time: 8:36
 * To change this template use File | Settings | File Templates.
 */
public class FlyNoWayStrategy implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("I do not fly");
    }
}
