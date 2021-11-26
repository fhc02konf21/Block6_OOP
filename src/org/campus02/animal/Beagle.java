package org.campus02.animal;

/* Schlüsselwort extends => Damit wird die Vererbung eingeleitet */
public class Beagle extends Dog{
    public String lovedFood;

    @Override
    public String toString() {
        return "Beagle{" +
                "lovedFood='" + lovedFood + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                '}';
    }
}
