package Homework2.Task1;

public class Whale extends Mammal implements Waterable {
    public Whale(String name, double weight, double length, Spine spine) {
        super(name, weight, length, spine);
    }

    @Override
    public void swim() {
        System.out.println(name + " плывёт");
    }

}
