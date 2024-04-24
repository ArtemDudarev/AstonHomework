package Second;

public class Cat extends Mammal {
    Wool wool;

    public Cat(String name, double weight, double length, Spine spine, Wool wool) {
        super(name, weight, length, spine);
        this.wool = wool;
    }
}
