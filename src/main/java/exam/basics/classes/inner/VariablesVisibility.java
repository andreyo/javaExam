package exam.basics.classes.inner;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 08.12.12
 * Time: 10:14
 * To change this template use File | Settings | File Templates.
 */
public class VariablesVisibility {
    private String a = "A any";

    public void method() {
        final String b = "B must be final";

        class Inner {
            public void methodInner() {
                System.out.println(a);
                System.out.println(b);
            }
        }
        new Inner().methodInner();
    }

    public static void main(String[] args) {
        new VariablesVisibility().method();
    }
}
