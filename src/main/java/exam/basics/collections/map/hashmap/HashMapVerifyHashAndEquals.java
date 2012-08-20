package exam.basics.collections.map.hashmap;

import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;


/**
 * User: andrey.osipov
 * Date: 8/6/12
 * Time: 5:02 PM
 */
public class HashMapVerifyHashAndEquals {

    private static final Logger log = Logger.getLogger(HashMapVerifyHashAndEquals.class);

    //HashMap is not synchronized, use Collections.synchronizedMap() wrapper

    public static void main(String[] args) {
        //if hashCodes of keys are different - values aren't overwritten
        keysHaveDifferentHashValuesAreDifferent();
        keysHaveDifferentHashValuesAreEqual();

        //if hashCodes of keys are equal - then everything depends on equals() method
        keysHaveEqualHashValuesAreDifferent();
        keysHaveEqualHashValuesAreEqual();
    }

    public static void keysHaveDifferentHashValuesAreDifferent() {
        Map<Key, String> hashMap = new HashMap<Key, String>();
        final Key key1 = new Key(1, false);
        final Key key2 = new Key(2, false);
        hashMap.put(key1, "hello");
        hashMap.put(key2, "bye");

        assertEquals("hello", hashMap.get(key1));
        assertEquals("bye", hashMap.get(key2));
    }

    public static void keysHaveDifferentHashValuesAreEqual() {
        Map<Key, String> hashMap = new HashMap<Key, String>();
        final Key key1 = new Key(1, true);
        final Key key2 = new Key(2, true);
        hashMap.put(key1, "hello");
        hashMap.put(key2, "bye");

        assertEquals("hello", hashMap.get(key1));
        assertEquals("bye", hashMap.get(key2));
    }

    public static void keysHaveEqualHashValuesAreDifferent() {
        Map<Key, String> hashMap = new HashMap<Key, String>();
        final Key key1 = new Key(1, false);
        final Key key2 = new Key(1, false);
        hashMap.put(key1, "hello");
        hashMap.put(key2, "bye");

        assertEquals("hello", hashMap.get(key1));//because values aren't equal
        assertEquals("bye", hashMap.get(key2));
    }

    public static void keysHaveEqualHashValuesAreEqual() {
        Map<Key, String> hashMap = new HashMap<Key, String>();
        final Key key1 = new Key(1, true);
        final Key key2 = new Key(1, true);
        hashMap.put(key1, "hello");
        hashMap.put(key2, "bye");

        assertEquals("bye", hashMap.get(key1));//because keys and values are equal
        assertEquals("bye", hashMap.get(key2));
    }
}
