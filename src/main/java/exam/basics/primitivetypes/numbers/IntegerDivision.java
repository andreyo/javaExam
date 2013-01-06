package exam.basics.primitivetypes.numbers;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 16.12.12
 * Time: 18:35
 * To change this template use File | Settings | File Templates.
 */
public class IntegerDivision {

    void aMethod() {
        float f = (1 / 4) * 10;
        int i = Math.round(f);
        System.out.println(i);
    }

    public static void main(String[] args) {
        new IntegerDivision().aMethod();
    }
}