package Third;

import java.util.Objects;

public class Spine {
    private final int quantityVertebra;
    private final double length;

    public Spine(int quantityVertebra, double length) {
        this.quantityVertebra = quantityVertebra;
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spine spine = (Spine) o;
        return quantityVertebra == spine.quantityVertebra && Double.compare(length, spine.length) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantityVertebra, length);
    }
}
