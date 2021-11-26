package org.campus02.customers;

/*
    Verwendung bei
     - Customer
     - Lieferungen
     - Adresse von Geschäftslokal
     - Adressen sammeln für Marketing
 */

public class Address {
    /* - (Minus) aus dem Klassendiagramm definiert den access modifier private */
    /* + (Plus) aus dem Klassendiagramm definiert den access modifier public */
    /* # (Raute) aus dem Klassendiagramm definiert den access modifier protected */
    private String street;
    private String zip;
    private String city;
    private String country;

    public Address(String street, String zip, String city, String country) {
        this.street = street;
        this.zip = zip;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", zip='" + zip + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
