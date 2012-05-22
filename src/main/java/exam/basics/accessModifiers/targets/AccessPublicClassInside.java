package exam.basics.accessModifiers.targets;

/**
 * User: andrey.osipov
 */
public class AccessPublicClassInside {

    public static void main(String[] args) {
        PublicClass.publicMethod();
        PublicClass.packagePrivateMethod();
        PublicClass.protectedMethod();
    }
}
