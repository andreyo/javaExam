package exam.basics.enums;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 06.03.11
 * Time: 13:35
 * To change this template use File | Settings | File Templates.
 */
public class PlayEnums {

    enum MyEnum {

        ONE, TWO, THREE, FOUR, FIVE;

        String a;
        String b;

        MyEnum() {
        }

        MyEnum(String a, String b) {
            this.a = a;
            this.b = b;
        }


        void method() {

        }
    }

    public static void main(String[] args) {
        for (MyEnum myEnum : MyEnum.values()) {
            myEnum.method();
            System.out.println(myEnum);
        }
    }
}
