package exam.basics.equalsAndHashCode;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 11.10.12
 * Time: 8:09
 * To change this template use File | Settings | File Templates.
 */
public class equalsAndHashCode {
    
    private String fieldA;
    private Integer fieldB;


    // equals must be: reflexive, symmetric, transitive
    //and consistent
    //hashCode must be: consistent

    // a.equals(b) then a.hashCode == b.hashCode, but reverse is not true
    // a.equals(null) must be always false

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        equalsAndHashCode that = (equalsAndHashCode) o;

        if (fieldA != null ? !fieldA.equals(that.fieldA) : that.fieldA != null) {
            return false;
        }
        if (fieldB != null ? !fieldB.equals(that.fieldB) : that.fieldB != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = fieldA != null ? fieldA.hashCode() : 0;
        result = 31 * result + (fieldB != null ? fieldB.hashCode() : 0);
        return result;
    }
}
