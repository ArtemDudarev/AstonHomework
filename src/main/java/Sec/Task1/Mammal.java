package Sec.Task1;

import java.util.Objects;

public abstract class Mammal extends Animal {

    protected final Spine spine;

    public Mammal(String name, double weight, double length, Spine spine) {
        super(name, weight, length);
        this.spine = spine;
    }

    public void drinkMilk() {
        System.out.println(name + " пьёт молоко");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mammal mammal = (Mammal) o;
        return Objects.equals(spine, mammal.spine);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(spine);
    }
}
