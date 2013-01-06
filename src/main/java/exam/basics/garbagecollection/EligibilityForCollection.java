package exam.basics.garbagecollection;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 16.12.12
 * Time: 17:59
 * To change this template use File | Settings | File Templates.
 */
public class EligibilityForCollection {
}

class C {

    public static void main(String a[]) {
        C c1 = new C();
        C c2 = m1(c1);
        C c3 = new C();
        c2 = c3;              //6
        System.out.println("After line 6, how many objects are eligible for garbage collection");
    }

    static C m1(C ob1) {
        ob1 = new C();
        return ob1;
    }
}