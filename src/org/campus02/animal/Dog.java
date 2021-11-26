package org.campus02.animal;

public class Dog {
    public String eyeColor;
    public int weight;
    private String privateValue;

    public void doSomething() {
        privateValue = "something";
        System.out.println("This is a dog!" + privateValue);
    }

    public String toString() {
        return "Dog{" +
                "eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                '}';
    }
}
