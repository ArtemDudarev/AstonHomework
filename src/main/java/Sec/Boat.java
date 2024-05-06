package Sec;

public class Boat implements WaterVehicle{
    private String name;
    private int capacity;
    private Wing wing;

    public Boat(String name, int capacity, Wing wing) {
        this.name = name;
        this.capacity = capacity;
        this.wing = wing;
    }

    @Override
    public void setSail() {
        System.out.println(name + " отчаливает");
    }

    @Override
    public void moor() {
        System.out.println(name + " причаливает");
    }

    @Override
    public void move() {
        System.out.println(name + " двигается");
    }

    @Override
    public void stop() {
        System.out.println(name + " останавливается");
    }

    @Override
    public void turnLeft() {
        System.out.println(name + " поворачивает налево");
    }

    @Override
    public void turnRight() {
        System.out.println(name + " поворачивает направо");
    }

    @Override
    public void fix() {
        System.out.println(name + " чинится");
    }
}
