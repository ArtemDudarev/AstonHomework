package Homework5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PuttingIntoPractice {

    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        //task 1
        System.out.println("==============task1==============");

        transactions.stream()
                .filter(x-> x.getYear() == 2011)
                .sorted(new Comparator<Transaction>() {
            @Override
            public int compare(Transaction o1, Transaction o2) {
                return o1.getValue() - o2.getValue();
            }
        })
                .forEach(System.out::println);

        //task 2
        System.out.println("==============task2==============");

        transactions.stream().map(x-> x.getTrader().getCity()).distinct().forEach(System.out::println);

        //task 3
        System.out.println("==============task3==============");

        transactions.stream().filter(x-> x.getTrader().getCity().equals("Cambridge"))
                .map(x-> x.getTrader().getName())
                .sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        }).distinct().forEach(System.out::println);

        //task 4
        System.out.println("==============task4==============");

        String allTrader = transactions.stream().map(x->x.getTrader().getName()).distinct().sorted().toList().toString();
        System.out.println(allTrader);

        //task 5
        System.out.println("==============task5==============");
        System.out.println(transactions.stream().anyMatch(x-> x.getTrader().getCity().equals("Milan")));

        //task 6
        System.out.println("==============task6==============");
        System.out.println(transactions.stream().filter(x->x.getTrader().getCity().equals("Cambridge")).mapToInt(x->x.getValue()).sum());

        //task 7
        System.out.println("==============task7==============");
        System.out.println(transactions.stream().mapToInt(x->x.getValue()).max());

        //task 8
        System.out.println("==============task8==============");
        System.out.println(transactions.stream().mapToInt(x-> x.getValue()).min());


    }


}
