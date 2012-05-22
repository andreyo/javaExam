package exam.basics.serialversionuid.bean;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

/**
 * User: andrey.osipov
 * Date: 5/16/12
 * Time: 10:16 AM
 */
public class Address extends BasicBean {

    String street;
    String country;

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return this.street;
    }

    public String getCountry() {
        return this.country;
    }

    @Override
    public String toString() {
        return new ReflectionToStringBuilder(this).toString();
    }
}