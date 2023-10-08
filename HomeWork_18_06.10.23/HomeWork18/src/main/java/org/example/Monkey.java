package org.example;

import java.util.function.Predicate;

public class Monkey {

    public static Predicate<Monkey> isYellowMonkey = monkey -> "Yellow".equals(monkey.getColour());

    public Monkey(String monkey1, int i, String brown, boolean b, double v) {
    }

    private String getColour() {
        return null;
    }

    public static void main(String[] args) {
        Monkey monkey1 = new Monkey("Monkey1", 5, "Brown", true, 10.5);
        Monkey monkey2 = new Monkey("Monkey2", 3, "Yellow", false, 8.2);

        System.out.println("Мартышка 1 желтая? " + isYellowMonkey.test(monkey1));
        System.out.println("Мартышка 2 желтая? " + isYellowMonkey.test(monkey2));
    }
}
