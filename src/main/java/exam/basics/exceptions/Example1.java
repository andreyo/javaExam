package exam.basics.exceptions;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 16.12.12
 * Time: 18:06
 * To change this template use File | Settings | File Templates.
 */
public abstract class Example1 {
}

class ThrowsDemo {

    static void throwMethod() throws IllegalAccessException {
        System.out.println("Inside throwMethod.");
        throw new IllegalAccessException("demo");
    }

    public static void main(String args[]) {
        try {
            throwMethod();
        } catch (IllegalAccessException e) {
            System.out.println("Caught " + e);
        }
    }
}