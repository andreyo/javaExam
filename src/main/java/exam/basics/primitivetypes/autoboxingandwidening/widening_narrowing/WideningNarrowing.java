package exam.basics.primitivetypes.autoboxingandwidening.widening_narrowing;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 22.12.12
 * Time: 19:26
 * To change this template use File | Settings | File Templates.
 */
public class WideningNarrowing {

    public static void main(String[] args) {
        long longValue = 100;
        byte b = (byte) (short) (int) longValue;

        byte byteValue = 100;
        long l = (long) (int) (short) byteValue;


        System.out.println(b + l);
    }
}
