package org.example;

import java.util.ArrayList;
import java.util.List;

public class TaskWithMonkey {

    public static void main(String[] args) {


        Monkey monkey1 = new Monkey("A", 3, "grey", false, 10.9);
        Monkey monkey2 = new Monkey("A", 2, "white", true, 10.1);
        Monkey monkey3 = new Monkey("J", 5, "grey", false, 7);
        Monkey monkey4 = new Monkey("B", 4, "black", true, 6);
        Monkey monkey5 = new Monkey("T", 3, "grey", false, 5);

        List<Monkey> monkeys = new ArrayList<>();

        monkeys.add(monkey1);
        monkeys.add(monkey2);
        monkeys.add(monkey3);
        monkeys.add(monkey4);
        monkeys.add(monkey5);

        monkeys.forEach(System.out::println);

        // Получить Map имя / информация, голодна ли обезьянка

        //Получить Map цвет / количество обезьян данного цвета
        //Получить Map цвет / список имен обезьян данного цвета
        //Создать компаратор и отсортировать исходный список по весу и имени
    }
}

