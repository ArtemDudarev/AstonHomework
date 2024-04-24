package org.example.First;

public class Plain implements AirVehicle, Carryable{
    private String name;
    private float liftingMass;
    private Wheel wheel1;
    private Wheel wheel2;
    private Wheel wheel3;
    private Wing wing1;
    private Wing wing2;

    public Plain(String name, float liftingMass, Wheel wheel1, Wheel wheel2, Wheel wheel3, Wing wing1, Wing wing2) {
        this.name = name;
        this.liftingMass = liftingMass;
        this.wheel1 = wheel1;
        this.wheel2 = wheel2;
        this.wheel3 = wheel3;
        this.wing1 = wing1;
        this.wing2 = wing2;
    }

    @Override
    public void landing() {
        System.out.println(name + " приземляется");
    }

    @Override
    public void TakeOff() {
        System.out.println(name + " взлетает");
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

    @Override
    public void transport(String something) {
        System.out.println(name + " транспортирует груз \"" + something + "\" массой: " + liftingMass + " кг");
    }
}
