package org.example;

import java.util.*;
public class Zoo {

    public static void main(String[] args) {
        Monkey monkey1 = new Monkey("A", 3, "grey", false);
        Monkey monkey2 = new Monkey("A", 2, "white", true);
        Monkey monkey3 = new Monkey("T", 3, "grey", false);
        Monkey monkey4 = new Monkey("J", 2, "black", true);
        Monkey monkey5 = new Monkey("Y", 1, "grey", true);

        List<Monkey> monkeys = new ArrayList<>();
        monkeys.add(monkey1);
        monkeys.add(monkey2);
        monkeys.add(monkey3);
        monkeys.add(monkey4);
        monkeys.add(monkey5);

//        Arrays.asList()

//        for (Monkey m : monkeys) {
//            System.out.println(m);
//        }
        Collections.sort(monkeys);
        for (Monkey m : monkeys) {
            System.out.println(m);
        }
        Collections.sort(monkeys, new CompareByAgeDecreasing());
        System.out.println("By Age Decreasing:");
        for (Monkey m : monkeys) {
            System.out.println(m);
        }

        Comparator<Monkey> comparatorByColour = new Comparator<Monkey>() {
            @Override
            public int compare(Monkey o1, Monkey o2) {
                return o1.getColour().compareTo(o2.getColour());
            }
        };

        Collections.sort(monkeys, comparatorByColour);
        System.out.println("By Colour:");
        for (Monkey m : monkeys) {
            System.out.println(m);
        }
    }
}