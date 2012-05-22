package exam.basics.generics;

import java.io.Serializable;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 06.03.11
 * Time: 14:45
 * To change this template use File | Settings | File Templates.
 */
public class Extends<T extends List> {


/*  implements in generics doesn't work!!!
class Implements<T implements Serializable> {
}
*/

    /*
    *  extends is used for Abstract Classes and INTERFACES!!!
    */
    <T extends Serializable> void method() {
        T t;
    }

    static <T extends List, Serializable, Number> void method2() {
        System.out.println("multiple extends");
    }

    public static void main(String[] args) {
        method2();
    }
}