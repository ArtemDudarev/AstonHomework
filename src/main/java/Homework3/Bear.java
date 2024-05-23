package Homework3;

import java.util.Objects;

public class Bear extends Mammal{
    private final Wool wool;

    public Bear(String name, double weight, double length, Spine spine, Wool wool) {
        super(name, weight, length, spine);
        this.wool = wool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bear bear = (Bear) o;
        return Objects.equals(wool, bear.wool);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(wool);
    }

    @Override
    public String toString() {
        return "Bear{" +
                "wool=" + wool +
                ", spine=" + spine +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", length=" + length +
                '}';
    }
}
