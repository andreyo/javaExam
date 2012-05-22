package exam.basics.parametersPassing;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 06.03.11
 * Time: 13:37
 * To change this template use File | Settings | File Templates.
 */
public class LValue {

    public static void main(String[] args) {
        Box box = new Box("Bye!");
//        getBoxMessageHello(box);
        getBoxMessageWazup(box);
        System.out.println(box);
    }

    public static void getBoxMessageHello(Box box) {
        box.setMessage("Hello");
    }

    public static void getBoxMessageWazup(Box box) {
        box = new Box("Wazup");
    }
}


class Box {

    private String message;

    Box(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Box{" + "message='" + message + '\'' + '}';
    }
}