package exam.basics.algorithms.fibonachi;

import org.apache.log4j.Logger;

/**
 * User: andrey.osipov
 * Date: 8/6/12
 * Time: 7:06 PM
 */
public class FibonachiFormula {

    private static final Logger log = Logger.getLogger(FibonachiFormula.class);

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            log.info(i + " : " + fib(i));
        }
    }

    public static double fib(int n) {
        final double sqrt5 = Math.sqrt(5);
        return 1 / sqrt5 * (Math.pow((1 + sqrt5) / 2, n) - Math.pow((1 - sqrt5) / 2, n));
    }
}
