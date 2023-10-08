package org.example;

import java.util.function.Consumer;

public class NumberPrinter {

    public static void main(String[] args) {
        Consumer<Integer> printEvenOdd = number -> {
            if (number % 2 == 0) {
                System.out.println("Четное число: " + number);
            } else {
                System.err.println("Нечетное число: " + number);
            }
        };

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int number : numbers) {
            printEvenOdd.accept(number);
        }
    }
}
