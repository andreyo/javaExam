package exam.basics.serialization.readwriteobject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 16.12.12
 * Time: 14:01
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        final String outFileName = "outFile.obj";
        A a = new A("Hello!");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(outFileName));
        objectOutputStream.writeObject(a);
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(outFileName));
        //TODO: Constructor is NOT called here!!!
        A a1 = (A) objectInputStream.readObject();
    }
}

class A implements Serializable {
    A() {
        System.out.println("A created");
    }

    A(String message) {
        System.out.println("A message: " + message);
    }
}