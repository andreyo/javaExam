package exam.basics.classes.circularreferences;

/**
 * User: andrey.osipov
 * Date: 8/9/12
 * Time: 11:34 AM
 */
public class ClassA {
    private ClassB classB;

    public ClassA(/*ClassB classB*/) {
        //this.classB = classB;
    }

    public void setClassB(ClassB classB) {
        this.classB = classB;
    }


    //the same way is recommended in Spring Framework to resolve circular references in beans
    //even - not use constructor argument at all

    public static void main(String[] args) {
        ClassA classA = new ClassA();
        ClassB classB = new ClassB(classA);
        classA.setClassB(classB);
    }
}
