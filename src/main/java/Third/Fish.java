package Third;

public class Fish extends Animal implements Waterable{

    public Fish(String name, double weight, double length) {
        super(name, weight, length);
    }

    @Override
    public void swim() {
    }

}
