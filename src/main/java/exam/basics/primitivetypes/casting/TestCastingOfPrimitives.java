package exam.basics.primitivetypes.casting;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 23.12.12
 * Time: 18:36
 * To change this template use File | Settings | File Templates.
 */
public class TestCastingOfPrimitives {

    int i = (int) (short) (byte) 1;
    boolean b;

    public static void main(String[] args) {
        try {
        throw new RuntimeException("yahoo!!");
        } catch (RuntimeException e) {
            System.out.println(e.toString());
        }
    }
}
