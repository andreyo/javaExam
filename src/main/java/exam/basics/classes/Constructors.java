package exam.basics.classes;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 06.03.11
 * Time: 14:12
 * To change this template use File | Settings | File Templates.
 */
public class Constructors {

    String message;

    public Constructors() {
        message = "Hello";
    }

    public Constructors(String s) {
        /*whether empty constructor be instantiated ? */
        message = s;
    }

    @Override
    public String toString() {
        return "Constructors{" + "message='" + message + '\'' + '}';
    }

    public static void main(String[] args) {
        Constructors constructors = new Constructors("WWW");
        System.out.println(constructors);
    }
}