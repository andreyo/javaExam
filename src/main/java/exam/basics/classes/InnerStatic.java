package exam.basics.classes;

/**
 * User: andrey.osipov
 */
public class InnerStatic {

    public class Inner {
//        ERROR
//        static int a;
    }

    static class Nested {
        static int a;
    }
}