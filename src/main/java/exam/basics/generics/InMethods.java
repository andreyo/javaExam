package exam.basics.generics;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 06.03.11
 * Time: 14:53
 * To change this template use File | Settings | File Templates.
 */
public class InMethods {

    public <T> InMethods(T t) {
        /*
        * Constructor with generic parameter
        */
        this.<String>method((String)t);
    }

    public static <U> void method(U u) {
        System.out.println(u.getClass());
    }

    public static void method(String s) {
        System.out.println("string executed");
    }

    public static void main(String[] args) {
        method("Hello");
        method(new ArrayList());
        method(new TreeSet());
        InMethods.<String>method("Abc");
        new <String> InMethods("aaaa");
    }
}