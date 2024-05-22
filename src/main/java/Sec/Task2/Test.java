package Sec.Task2;

public class Test {


    public static void main(String[] args) {
        Plain plain = new Plain("Аэробус", 10000,
                new Wheel("Мишлен", 0.3, 2),
                new Wheel("Мишлен", 0.3, 2),
                new Wheel("Мишлен", 0.3, 2),
                new Wing(20, "металл", 5000),
                new Wing(20, "металл", 5000));
        plain.fix();
        plain.move();
        plain.turnLeft();
        plain.turnRight();
        plain.TakeOff();
        plain.transport("Посылки с Ali");
        plain.landing();
        plain.stop();
    }
}
