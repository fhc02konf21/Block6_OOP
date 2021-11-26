package org.campus02.customers;

import java.util.ArrayList;

public class Customer {
    private int customerNumber;
    private ArrayList<Address> addresses; // = new ArrayList<>();

    public Customer(int customerNumber) {
        this.customerNumber = customerNumber;
        addresses = new ArrayList<>();
        // ArrayList addresses muss entweder direkt bei Attribut, oder in (allen) Konstruktoren initialisiert werden
    }

    public void addAddress(Address a) {
        addresses.add(a);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", addresses=" + addresses +
                '}';
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }
}
