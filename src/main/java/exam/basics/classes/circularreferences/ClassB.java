package exam.basics.classes.circularreferences;

/**
 * User: andrey.osipov
 * Date: 8/9/12
 * Time: 11:35 AM
 */
public class ClassB {
    private ClassA classA;

    public ClassB(ClassA classA) {
        this.classA = classA;
    }

    public void setClassA(ClassA classA) {
        this.classA = classA;
    }
}
