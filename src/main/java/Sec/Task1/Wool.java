package Sec.Task1;

import java.util.Objects;

public class Wool {
    private final String color;

    public Wool(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wool wool = (Wool) o;
        return Objects.equals(color, wool.color);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(color);
    }

}
