package exam.basics.classes.inheritance;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 08.12.12
 * Time: 10:51
 * To change this template use File | Settings | File Templates.
 */
interface IFace {
}

class CFace implements IFace {
}

class Base {
}

class ObRef extends Base {
}

/**
 * Children can be assigned to Parents but NOT Vice Versa
 */
public class LiskovPrinciple {

    public static void main(String argv[]) {
        ObRef ob = new ObRef();
        Base b = new Base();
        Object o1 = new Object();
        IFace o2 = new CFace();

        o1 = o2;
        b = ob;
        //ob=b;
        o1 = b;

    }
}



