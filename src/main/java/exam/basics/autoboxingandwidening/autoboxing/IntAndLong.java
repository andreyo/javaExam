package exam.basics.autoboxingandwidening.autoboxing;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 08.12.12
 * Time: 10:38
 * To change this template use File | Settings | File Templates.
 */
public class IntAndLong {

    public static void main(String... args) throws Exception {
        sourceMethod();
        decompiledMethod();
    }

    public static void sourceMethod() {
        Integer intValue = 34;
        long longValue = 34L;
        if (intValue.equals(longValue)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    /**
     * Decompiled version of method above
     */
    public static void decompiledMethod() {
        Integer intValue = Integer.valueOf(34);
        long longValue = 34L;
        if (intValue.equals(Long.valueOf(longValue))) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
