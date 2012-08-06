package exam.basics.collections.hashmapandtreemap;

import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;


/**
 * User: andrey.osipov
 * Date: 8/6/12
 * Time: 5:02 PM
 */
public class HashMapVSTreeMap {

    private static final Logger log = Logger.getLogger(HashMapVSTreeMap.class);

    public static void main(String[] args) {
        Map<Key, String> hashMap = new HashMap<Key, String>();
        final Key key1 = new Key(1);
        final Key key2 = new Key(2);
        hashMap.put(key1, "hello");
        hashMap.put(key2, "bye");

        assertEquals(hashMap.get(key1), "hello");
        log.info(hashMap.get(key2));
    }

    public void verifyHashMap() {
    }
}
