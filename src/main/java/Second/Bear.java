package Second;

public class Bear extends Mammal{
    private Wool wool;

    public Bear(String name, double weight, double length, Spine spine, Wool wool) {
        super(name, weight, length, spine);
        this.wool = wool;
    }
}
