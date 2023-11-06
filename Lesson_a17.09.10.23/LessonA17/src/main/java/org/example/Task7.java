package org.example;

import java.util.Arrays;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = numbers.stream()
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Сумма чисел, кратных 3 и 5: " + sum);
    }
}