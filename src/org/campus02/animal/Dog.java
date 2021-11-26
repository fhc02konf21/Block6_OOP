package org.campus02.animal;

public class Dog extends Object {
    public String eyeColor;
    public int weight;
    private String privateValue;

    public void doSomething() {
        privateValue = "something";
        System.out.println("This is a dog!" + privateValue);
    }

    public void bark() {
        System.out.println("This dog sound like: wuff wuff");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                '}';
    }
}
