package exam.basics.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * User: andrey.osipov
 * Date: 8/9/12
 * Time: 10:13 AM
 */
public class ArrayListTest {

    public static void main(String[] args) {

        //ArrayList is same to Vector, except Vector is synchronized and ArrayList - not

        List<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList("a", "b", "c"));
        //this operation leads to execution of System.arraycopy() twice (in grow() and add())
        list.add(1, "d");
        //same story
        list.remove(1);

        System.out.println(list);

        //use this to make it synchronized:
        List syncList = Collections.synchronizedList(list);
    }
}
