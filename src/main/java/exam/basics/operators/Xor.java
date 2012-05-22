package exam.basics.operators;

/**
 * User: andrey.osipov
 * Date: 2/8/12
 * Time: 1:39 PM
 */
public class Xor {

    public static void main(String[] args) {
//        doXor();
        doConstants();
    }

    private static void doXor() {
        int r1 = 21;
        int r2 = 88;

/*
        r1 ^= r2;
        r2 ^= r1;
        r1 ^= r2;
*/
        r1 ^= r2 ^= r1 ^= r2;
//        r1 ^= r2;

        System.out.println(r1);
        System.out.println(r2);
    }

    public static void doConstants() {
        int a = 10;
        int b = 5;

//        a += b += a += b;
//        a += b;
//        b += a;
//        a += b;

        b += a += b;
//        b += a += b;

        System.out.println(b);
    }
}