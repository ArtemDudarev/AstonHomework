package Homework6.New;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class DataNioStreamRunnerNew {


    private final static Path path = Paths.get("src\\main\\resources\\SavePersons.txt");

    public static void writePerson(Person somePerson) throws IOException {
        Files.write(path,somePerson.toString().getBytes(), StandardOpenOption.APPEND);
        System.out.println("File has been written");
    }

    public static void readPerson() throws IOException {
        List<String> list = Files.readAllLines(path, UTF_8);

        for (String s: list) {
            String[] data = s.split(", ");
            Person somePerson = new Person(data[0],
                    Integer.parseInt(data[1]),
                    Double.parseDouble(data[2]),
                    Boolean.parseBoolean(data[3]));
            System.out.print(somePerson);
        }
    }

    public static void main(String[] args) {
        Person tom = new Person("Tom", 34, 1.68, false);
        Person tim = new Person("Tim", 23, 1.65, true);
        Person sam = new Person("Sam", 12, 1.78, false);
        try {
            writePerson(tom);
            writePerson(tim);
            writePerson(sam);
            readPerson();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
class Person {
    public String name;
    public int age;
    public double height;
    public boolean married;

    public Person(String n, int a, double h, boolean m) {
        this.name = n;
        this.height = h;
        this.age = a;
        this.married = m;
    }

    @Override
    public String toString() {
        return name + ", " + age + ", " + height + ", " + married + "\n";
    }
}
