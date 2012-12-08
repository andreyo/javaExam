package exam.basics.serialization.staticnotserialized;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 08.12.12
 * Time: 11:08
 * To change this template use File | Settings | File Templates.
 */
class Bean implements Serializable {
    public transient int a = 7;
    public static int b = 9;
}

public class StaticNotSerialized {
    public static final String FILE_NAME = "bean.out";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Bean bean = new Bean();
        printBean(bean);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
        objectOutputStream.writeObject(bean);
        objectOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_NAME));
        Bean bean1 = (Bean) objectInputStream.readObject();
        printBean(bean1);
        //Static will remain the same, because JVM already initialized the value!
    }

    private static void printBean(Bean bean) {
        System.out.println(bean.a + " " + bean.b);
    }

}
