package exam.basics.collections.map.hashmap;

/**
 * User: andrey.osipov
 * Date: 8/6/12
 * Time: 5:08 PM
 */
public class Key {
    private int hashCode;
    private boolean equals;

    public Key() {
    }

    public Key(int hashCode, boolean equals) {
        this.hashCode = hashCode;
        this.equals = equals;
    }

    @Override
    public int hashCode() {
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        return equals;
    }
}