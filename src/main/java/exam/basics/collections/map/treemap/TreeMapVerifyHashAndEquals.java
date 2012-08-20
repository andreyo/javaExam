package exam.basics.collections.map.treemap;

import org.apache.log4j.Logger;

import java.util.Map;
import java.util.TreeMap;

/**
 * User: andrey.osipov
 * Date: 8/7/12
 * Time: 11:46 AM
 */
public class TreeMapVerifyHashAndEquals {

    private static final Logger log = Logger.getLogger(TreeMapVerifyHashAndEquals.class);

    //TreeMap is not synchronized

    public static void main(String[] args) {
        verifyTreeMap();
    }

    public static void verifyTreeMap() {
        Map<ComparableKey, String> treeMap = new TreeMap<ComparableKey, String>();
        final ComparableKey key1 = new ComparableKey(1);
        final ComparableKey key2 = new ComparableKey(2);
        treeMap.put(key1, "hello");
        treeMap.put(key2, "bye");

        log.info(treeMap.get(key1));
        log.info(treeMap.get(key2));
    }
}
