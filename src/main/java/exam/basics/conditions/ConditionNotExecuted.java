package exam.basics.conditions;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 08.12.12
 * Time: 10:25
 * To change this template use File | Settings | File Templates.
 */
public class ConditionNotExecuted {
    public static void main(String[] args) throws InterruptedException {

        int output = 1;
        boolean b1 = false;

        if ((output += 1) == 2) {
            System.out.println("Condition executed " + output);
        }

        if ((b1 == true) && ((output += 1) == 3)) {
            System.out.println("Condition executed " + output);
        } else {
            System.out.println("Condition not executed " + output);
        }
    }
}
