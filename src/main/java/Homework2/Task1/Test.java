package Homework2.Task1;

public class Test {
    public static void main(String[] args) {
        Bear bear = new Bear("Misha", 300, 2.20, new Spine(43, 2),new Wool("black"));
        Bear bear1 = new Bear("Misha", 300, 2.20, new Spine(45, 2),new Wool("black"));

        System.out.println(bear == bear1);
        System.out.println(bear.equals(bear1));
        System.out.println(bear.hashCode());
        System.out.println(bear1.hashCode());
    }
}
