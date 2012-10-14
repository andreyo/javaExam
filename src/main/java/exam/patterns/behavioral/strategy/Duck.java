package exam.patterns.behavioral.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 14.10.12
 * Time: 8:32
 * To change this template use File | Settings | File Templates.
 */
public class Duck {

    private FlyStrategy flyStrategy;
    private QuackStrategy quackStrategy;

    public FlyStrategy getFlyStrategy() {
        return flyStrategy;
    }

    public void setFlyStrategy(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    public QuackStrategy getQuackStrategy() {
        return quackStrategy;
    }

    public void setQuackStrategy(QuackStrategy quackStrategy) {
        this.quackStrategy = quackStrategy;
    }

    public void fly() {
        flyStrategy.fly();
    }

    public void quack() {
        quackStrategy.quack();
    }
}
