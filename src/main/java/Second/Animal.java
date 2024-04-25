package Second;

import java.util.Objects;

public abstract class Animal  {
    protected final String name;
    protected final double weight;
    protected final double length;

    public Animal(String name, double weight, double length) {
        this.name = name;
        this.weight = weight;
        this.length = length;
    }


    public void sound(){
        System.out.println(name + " издаёт звук");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(weight, animal.weight) == 0 && Double.compare(length, animal.length) == 0 && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, length);
    }
}
