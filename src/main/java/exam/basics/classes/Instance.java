package exam.basics.classes;

import java.lang.reflect.Array;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 06.03.11
 * Time: 13:34
 * To change this template use File | Settings | File Templates.
 */
public class Instance {

    public void method() {
        System.out.println("executed");
        String a;
    }

    public static void main(String[] args) {
        new Instance().method();

        String[] array = (String[]) Array.newInstance(String.class, 5);
    }
}
