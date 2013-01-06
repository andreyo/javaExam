package exam.basics.classes.inheritance.multiple;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 23.12.12
 * Time: 16:12
 * To change this template use File | Settings | File Templates.
 */
public class Implementation implements Interface1WithCommonMethod, Interface2WithCommonMethod {

    @Override
    public int count() {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new Implementation().count());
        //WORKS FINE!!
    }
}
