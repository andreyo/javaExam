package exam.basics.accessModifiers;

import exam.basics.accessModifiers.targets.PublicClass;

/**
 * User: andrey.osipov
 */
public class AccessPublicClassOutside {

    public static void main(String[] args) {
        PublicClass.publicMethod();
//        NO PACKAGE PRIVATE
//        PublicClass.packagePrivateMethod();
//        NO PROTECTED
//        PublicClass.protectedMethod();
    }
}