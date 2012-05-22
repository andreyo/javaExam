package exam.basics.accessModifiers.targets;

/**
 * User: andrey.osipov
 */
public class AccessPackagePrivateClassInside {

    public static void main(String[] args) {
        PackagePrivateClass.publicMethod();
        PackagePrivateClass.packagePrivateMethod();
        PackagePrivateClass.protectedMethod();
    }
}
