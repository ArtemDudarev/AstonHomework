package Homework4;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("==========================ArrayList===========================");

        List<String> list = new ArrayList<>(Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg"));

        System.out.println("Изначальная коллекция: \n" +  list);

        list.add("hhh");

        System.out.println("Добавление элемента: \n" + list);

        list.remove(7);

        System.out.println("Удаление элемента по индексу: \n" + list);

        list.remove("ccc");

        System.out.println("Удаление элемента по значению: \n" + list);

        System.out.println(list.contains("aaa"));
        System.out.println(list.contains("iii"));

        list.removeAll(Arrays.asList("aaa","ggg"));

        System.out.println("Удаление коллекции: \n" + list);

        list.clear();

        System.out.println("Очистка коллекции: \n" + list);

        list.add("q");
        list.add("w");
        list.add("e");
        list.add("r");
        list.add("t");
        //list.add("y");
        list.add("u");
        list.add("i");
        list.add("o");
        list.add("p");

        System.out.println("Кол-во элементов коллеции: \n" + list.size());
        System.out.println("Новая колекция: \n" + list);

        list.add(5,"y");

        System.out.println("Добавление в середину по индексу: \n" + list);

        list.set(7,"I");

        System.out.println("Замена элемента по индексу: \n" + list);

        //Stream API
        System.out.println("Добавлене к элементу его номера");
        list.stream().map(x->list.indexOf(x) + ") " + x).forEach(System.out::println);
        System.out.println("Кол-во элементов " + list.stream().count());

        List<Integer> listInt = new ArrayList<>(Arrays.asList(1,2,5,6,4,7,8,9,3));
        listInt.stream().sorted((o1,o2) ->  o2 - o1).limit(5).forEach(System.out::println);

        System.out.println("==========================LinkedList===========================");

        List<String> linkedList = new LinkedList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g"));
        linkedList.add("h");
        linkedList.add(0, "= ");

        System.out.println("Добавление элементов: \n" + linkedList);

        linkedList.set(3,"D");

        System.out.println(linkedList);

        System.out.println("Размер массива: \n" + linkedList.size());


        linkedList.stream().filter(x -> x.equals("D") || x.equals("g") || x.equals("=")).forEach(System.out::println);

        System.out.println("==========================Hashmap===========================");

        Map<Integer,String> hashMap = new HashMap<>();
        hashMap.putAll(Map.of(1,"aaa",2,"bbb",3, "ccc"));
        hashMap.forEach((integer, s) -> System.out.println(integer + s));



    }
}

