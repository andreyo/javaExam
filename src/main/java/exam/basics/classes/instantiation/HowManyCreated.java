package exam.basics.classes.instantiation;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 16.12.12
 * Time: 13:19
 * To change this template use File | Settings | File Templates.
 */
public class HowManyCreated {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("abc");
        StringBuffer s2 = s1;
        StringBuffer s3 = new StringBuffer("abc");
        System.out.println(s1);
    }
}
