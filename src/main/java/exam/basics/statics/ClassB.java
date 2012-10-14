package exam.basics.statics;

/**
 * User: andrey.osipov
 * Date: 8/7/12
 * Time: 2:35 PM
 */
public class ClassB extends ClassA {

    public static void main(String[] args) {
        new ClassB();//static methods aren't inherited
    }
}
