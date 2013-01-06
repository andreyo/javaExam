package exam.basics.classes.inheritance;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 22.12.12
 * Time: 19:45
 * To change this template use File | Settings | File Templates.
 */
public class MethodOverriding {
}
//Child implementations can make
//                      NARROW-OR-EQUAL return type
//                      NARROW-OR-EQUAL exceptions thrown
//                      exactly SAME parameter (no widening/narrowing, auto-boxing/unboxing), because another type is another method!!!

class SuperClass {

    public Map someMethod(String object) throws Exception {
        return null;
    }

}

class SubClass extends SuperClass {

    @Override
    public HashMap someMethod(String object) throws ClassNotFoundException {
        return null;
    }
}