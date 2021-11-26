package org.campus02.animal;

public class DemoDogApp {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.eyeColor = "brown";
        d.weight = 2900;
//        d.doSomething2();
        System.out.println("ausgabe: " + d.toString());
        d.doSomething();
        d.bark();

        System.out.println("beagle");
        Beagle b = new Beagle();
        b.eyeColor = "blue";
        b.weight = 2850;
        b.lovedFood = "burger";

        b.doSomething();
        b.doSomething2();
        System.out.println(b.toString());
        b.bark();

    }
}
