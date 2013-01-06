package exam.basics.accessModifiers.packageprivate2;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 23.12.12
 * Time: 16:46
 * To change this template use File | Settings | File Templates.
 */
public class ClassFromAccess {

    public static void main(String[] args) {

        //PACKAGE-PRIVATE ARE ACCESED!!
        new ClassWithVariablesToAccess().packagePrivateMethod();
        int value2 = new ClassWithVariablesToAccess().value1;

        //
        new ClassWithVariablesToAccess().protectedMethod();
    }
}
