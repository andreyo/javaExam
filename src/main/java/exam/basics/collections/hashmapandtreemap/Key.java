package exam.basics.collections.hashmapandtreemap;

/**
 * User: andrey.osipov
 * Date: 8/6/12
 * Time: 5:08 PM
 */
public class Key {
    private int hashCode;

    public Key() {
    }

    public Key(int hashCode) {
        this.hashCode = hashCode;
    }

    @Override
    public int hashCode() {
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}