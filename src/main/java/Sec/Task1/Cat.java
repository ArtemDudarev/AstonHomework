package Sec.Task1;

import java.util.Objects;

public class Cat extends Mammal {
    private final Wool wool;

    public Cat(String name, double weight, double length, Spine spine, Wool wool) {
        super(name, weight, length, spine);
        this.wool = wool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(wool, cat.wool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wool);
    }
}
