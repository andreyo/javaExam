package exam.basics.algorithms.noLoop;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 06.03.11
 * Time: 14:10
 * To change this template use File | Settings | File Templates.
 */
public class oneTo100 {

    /*    PRINT NUMBERS FROM 1 TO 100 WITHOUT LOOPS AND CONDITIONS

    1. Arrays (but inside it has loops and conditions)
    2. Print file content
    3.
    */

    public static void doWithArrays() {
        int[] array = new int[100];
    }

    public static void doWithArraysUtil() {
        Object[] array = new Object[100];
        Arrays.fill(array, new Object() {
            int index = 1;

            @Override
            public String toString() {
                return String.valueOf(index++);
            }
        });

        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        doWithArraysUtil();
    }
}