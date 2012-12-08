package exam.basics.classes.inner;

/**
 * User: andrey.osipov
 */
public class InnerStatic {

    public class Inner {
//        ERROR
//        statics int a;
    }

    static class Nested {
        static int a;
    }
}