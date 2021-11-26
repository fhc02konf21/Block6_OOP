package org.campus02.customers;

import java.util.ArrayList;

public class Customer extends Person {
    private int customerNumber;
    private ArrayList<Address> addresses; // = new ArrayList<>();

    public Customer(int customerNumber) {
        this.customerNumber = customerNumber;
        addresses = new ArrayList<>();
        // ArrayList addresses muss entweder direkt bei Attribut, oder in (allen) Konstruktoren initialisiert werden
    }

    // auch Konstruktoren kann man überladen
    public Customer(int customerNumber, ArrayList<Address> addresses) {
        this.customerNumber = customerNumber;
        this.addresses = addresses;
    }

    public void addAddress(Address a) {
        addresses.add(a);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", addresses=" + addresses +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }
}
