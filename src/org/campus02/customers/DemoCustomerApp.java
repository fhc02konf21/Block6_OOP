package org.campus02.customers;

import java.util.ArrayList;

public class DemoCustomerApp {

    public static void main(String[] args) {

        Customer customer1 = new Customer(1);
        Customer customer2 = new Customer(2, new ArrayList<>());

        customer1.firstname = "Max";
        customer1.lastname = "Mustermann";

        customer2.firstname = "Susi";
        customer2.lastname = "Sorglos";

        customer1.print();
        customer2.print();

        customer1.addAddress(new Address("Weizerstraße 1", "8010", "Graz", "Austria"));
        customer2.addAddress(new Address("Bachgasse 7a", "8020", "Graz", "Austria"));
        customer1.addAddress(new Address("Siebengasse 8a", "1010", "Wien", "Austria"));

        System.out.println("customer1 = " + customer1.toString());
        System.out.println("customer2 = " + customer2.toString());

    }
}
