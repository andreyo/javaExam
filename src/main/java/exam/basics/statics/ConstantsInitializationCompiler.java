package exam.basics.statics;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 16.12.12
 * Time: 18:22
 * To change this template use File | Settings | File Templates.
 */
class ConstantsInitializationCompiler {
    static String s1 = "I am unique!";

    public static void main(String args[]) {
        String s2 = "I am unique!";
        String s3 = new String(s1);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s3 == s1);
        System.out.println(s3.equals(s1));
        System.out.println(TestClass.s4 == s1);
    }
}

class TestClass {
    static String s4 = "I am unique!";
}