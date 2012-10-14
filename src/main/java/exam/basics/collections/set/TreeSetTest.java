package exam.basics.collections.set;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 13.10.12
 * Time: 9:50
 * To change this template use File | Settings | File Templates.
 */
public class TreeSetTest {

    public static void main(String[] args) {
        Set set = new TreeSet();
        String s1 = new String("abc");
        String s2 = new String("abc");
        Bean b1 = new Bean("abc");
        Bean b2 = new Bean("abc");
        set.add(s1);
        set.add(s2);
        set.add(b1);
        set.add(b2);
    }
}

class Bean {
    private String field;

    Bean(String field) {
        this.field = field;
    }
}