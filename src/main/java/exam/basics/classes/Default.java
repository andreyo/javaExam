package exam.basics.classes;

import java.util.Vector;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 08.12.12
 * Time: 16:39
 * To change this template use File | Settings | File Templates.
 */
public class Default {

    Vector vector;

    Default() {
        vector = new Vector();

    }

    Default(int i) {

    }

    public static void main(String[] args) {
        System.out.println("YO");
    }
}

class Base {
    public static void main(String[] args) {
        System.out.println("HI");
    }

}