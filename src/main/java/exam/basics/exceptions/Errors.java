package exam.basics.exceptions;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 23.12.12
 * Time: 10:07
 * To change this template use File | Settings | File Templates.
 */
public class Errors {

    public static void throwError() throws Error {
        throw new Error("this is error");
    }

    public static void main(String[] args) {
        try {
            throwError();
        } catch (Error e) {
            System.out.println("catched : " + e);
        }
    }
}
