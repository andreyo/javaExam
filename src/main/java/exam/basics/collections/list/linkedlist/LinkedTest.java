package exam.basics.collections.list.linkedlist;

import java.util.LinkedList;
import java.util.List;

/**
 * User: andrey.osipov
 * Date: 8/9/12
 * Time: 10:10 AM
 */
public class LinkedTest {

    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        //just re-link the sequence
        list.add(0, "");
        list.remove(0);

        System.out.println(list);
    }
}
