package java;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 23.12.12
 * Time: 18:19
 * To change this template use File | Settings | File Templates.
 */
public class MyProhibitedPackageClass {

    public static void main(String[] args) {
        //java.lang.SecurityException: Prohibited package name:
        new MyProhibitedPackageClass();
    }
}
