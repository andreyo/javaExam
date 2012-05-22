package exam.basics.serialversionuid;

import exam.basics.serialversionuid.bean.Address;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: andrey.osipov
 * Date: 5/16/12
 * Time: 10:46 AM
 */
public class ProveNecessityOfSerialVersionUIDTest {
    public static final String FILE_PATH = "address.ser";

    ProveNecessityOfSerialVersionUID proveUID;

    @Before
    public void init() throws Exception {
        proveUID = new ProveNecessityOfSerialVersionUID();
    }

    @Test
    public void writeObject() throws Exception {
        proveUID.writeObject(getAddress(), FILE_PATH);
    }

    @Test
    public void readObject() throws Exception {
        Address addressDeserialized = proveUID.readObject(FILE_PATH);

        final Address address = getAddress();
        assertEquals(address.getCountry(), addressDeserialized.getCountry());
        assertEquals(address.getStreet(), addressDeserialized.getStreet());
    }

    private Address getAddress() {
        Address address = new Address();
        address.setCountry("Canada");
        address.setStreet("Kreshatik");
        return address;
    }
}
