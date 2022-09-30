package org.genspark;

import org.springframework.beans.factory.annotation.Required;

public class Address {
    private String city;
    private String state;
    private String country;
    private String zipcode;

    public String getCity() {
        return city;
    }
    @Required
    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }
    @Required
    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }
    @Required
    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }
    @Required
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String toString(){
        return city+" "+state+" "+country+" "+zipcode;
    }
}
