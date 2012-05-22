package exam.basics.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 06.03.11
 * Time: 13:36
 * To change this template use File | Settings | File Templates.
 */
public class Nested {

    public static void main(String[] args) {

        List<List<Integer>> table = new ArrayList<List<Integer>>();     //good
//        List<List<Integer>> table =new ArrayList<ArrayList<Integer>>();  //bad

        for (int i = 0; i <= 10; i++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j <= 10; j++)
                row.add(i * j);
            table.add(row);
        }
        for (List<Integer> row : table)
            System.out.println(row);
    }
}
