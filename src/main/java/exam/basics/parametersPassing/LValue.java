package exam.basics.parametersPassing;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 06.03.11
 * Time: 13:37
 * To change this template use File | Settings | File Templates.
 */
public class LValue {

    private static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(LValue.class);

    public static void main(String[] args) throws InterruptedException {
        final LValue lValue = new LValue();
        final Box box = new Box("Hello!");

        new Thread() {
            @Override
            public void run() {
                lValue.readValue(box);
            }
        }.start();
        box.setMessage("How are you?");
    }

    public void readValue(Box box) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("readValue: " + box);
    }

    public void setValue(Box box) {
        box.setMessage("Bye!");
        log.info("setValue: " + box);
    }

    public void rewrite(Box box) {
        box = new Box("Wazup?!");
        log.info("rewrite: " + box);
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