package Second;

public abstract class Animal  {
    protected String name;
    protected double weight;
    protected double length;

    public Animal(String name, double weight, double length) {
        this.name = name;
        this.weight = weight;
        this.length = length;
    }


    public void sound(){
        System.out.println(name + " издаёт звук");
    }
}
