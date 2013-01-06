package exam.basics.classes.inheritance.packageprivate.package2;

import exam.basics.classes.inheritance.packageprivate.package1.Superclass;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 23.12.12
 * Time: 16:01
 * To change this template use File | Settings | File Templates.
 */
public class Subclass extends Superclass {

    @Override
    protected void protectedMethod() {
        //packagePrivateMethod  IS NOT INHERITED, and can't be called even here
    }

    public static void main(String[] args) {
        new Subclass().protectedMethod();

        //packagePrivateMethod is NOT INHERITED!!!
    }
}
