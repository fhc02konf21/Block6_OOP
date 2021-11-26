package org.campus02.animal;

/* Schlüsselwort extends => Damit wird die Vererbung eingeleitet */
public class Beagle extends Dog{

    /* Kommt über die Vererbung automatisch in die Klasse
    public String eyeColor;
    public int weight;

    public void doSomething() {
        System.out.println("This is a dog!");
    }

    public String toString() {
        return "Dog{" +
                "eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                '}';
    }

     */
    public String lovedFood;

    public void doSomething2() {
        System.out.println("this is beagle");
    }

    @Override
    public String toString() {
        return "Beagle{" +
                "lovedFood='" + lovedFood + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
//                ", privateValue = " + privateValue +
                '}';
    }
}
