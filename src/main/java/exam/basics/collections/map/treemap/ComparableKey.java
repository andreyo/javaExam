package exam.basics.collections.map.treemap;

/**
 * User: andrey.osipov
 * Date: 8/7/12
 * Time: 11:46 AM
 */
public class ComparableKey implements Comparable {

    private int hashCode;

    public ComparableKey(int hashCode) {
        this.hashCode = hashCode;
    }

    @Override
    public int hashCode() {
        return hashCode;
    }

    @Override
    public int compareTo(Object o) {
        return 0; //all keys are equal
    }
}
