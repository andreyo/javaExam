package tasks.google;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by User on 04.11.2014.
 */
public class LowMidHigh {
    public static final int NOT_SET = -1;

    public void sortLowMidHigh(int[] arr) {
        int leftMid = NOT_SET, leftHigh = NOT_SET;
        for (int i = 0; i < arr.length; i++) {
            int el = arr[i];
            if (isHigh(el)) {
                if (leftHigh == NOT_SET) leftHigh = i;
            }
            if (isMid(el)) {
                if (leftMid == NOT_SET) leftMid = i;
                if (leftHigh > NOT_SET) swap(arr, i, leftHigh++);
            }
            if (isLow(el)) {
                if (leftMid > NOT_SET) swap(arr, i, leftMid++);
                if (leftHigh > NOT_SET) swap(arr, i, leftHigh++);
            }
        }
    }

    public boolean isLow(int i) {
        return i % 3 == 0;
    }

    public boolean isMid(int i) {
        return i % 3 == 1;
    }

    public boolean isHigh(int i) {
        return i % 3 == 2;
    }

    public void swap(int[] arr, int i1, int i2) {
        int tmp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = tmp;
    }


    public static void main(String[] args) {
//        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        new LowMidHigh().sortLowMidHigh(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void check() {
    }
}
