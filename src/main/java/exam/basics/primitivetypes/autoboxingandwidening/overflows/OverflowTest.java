package exam.basics.primitivetypes.autoboxingandwidening.overflows;

import java.io.File;

import static org.junit.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 19.08.12
 * Time: 10:14
 * To change this template use File | Settings | File Templates.
 */
public class OverflowTest {

    public int getSize(File f) {
        return (int) f.length();
    }

    public int getSize(long size) {
        return (int) size;
    }

    public static void main(String[] args) {
        assertEquals(1000000000, new OverflowTest().getSize(5294967296l));
    }
}
