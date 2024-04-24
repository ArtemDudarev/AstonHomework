package Second;

public abstract class Mammal extends Animal{

    protected Spine spine;

    public Mammal(String name, double weight, double length, Spine spine) {
        super(name, weight, length);
        this.spine = spine;
    }

    public void drinkMilk() {
        System.out.println(name + " пьёт молоко");
    }

}
