package exam.basics.algorithms.fibonachi;

import org.apache.log4j.Logger;

import java.util.HashMap;

/**
 * User: andrey.osipov
 * Date: 8/6/12
 * Time: 6:48 PM
 */
public class Fibonachi {
    private static final Logger log = Logger.getLogger(Fibonachi.class);
    private HashMap<Integer, Integer> hash;

    public Fibonachi() {
        hash = new HashMap<Integer, Integer>();
        hash.put(1, 1);
        hash.put(0, 0);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            log.info(i + " : " + new Fibonachi().fib(i));
        }
    }

    public Integer fib(Integer n) {
        Integer value = hash.get(n);
        if (value != null) {
            return value;
        } else {
            value = fib(n - 2) + fib(n - 1);
            hash.put(n, value);
            return value;
        }
    }
}
