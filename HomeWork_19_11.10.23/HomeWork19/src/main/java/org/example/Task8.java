package org.example;

/*

 * У нас есть список списков numbers,
 * и мы хотим получить все четные числа из этих списков.
 * Мы используем flatMap, чтобы преобразовать каждый внутренний
 * список в поток чисел, а затем фильтруем только четные числа.
 * Результат: Even numbers: [2, 4, 6].

         List<List<Integer>> numbers = Arrays.asList(
        Arrays.asList(1, 2),
        Arrays.asList(3, 4),
        Arrays.asList(5, 6)
        );

 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Task8 {

    public class Main {
        public static void main(String[] args) {
            List<List<Integer>> numbers = Arrays.asList(
                    Arrays.asList(1, 2),
                    Arrays.asList(3, 4),
                    Arrays.asList(5, 6)
            );

            List<Integer> evenNumbers = numbers.stream()
                    .flatMap(List::stream) // Преобразуем каждый внутренний список в поток чисел
                    .filter(num -> num % 2 == 0) // Фильтруем только четные числа
                    .collect(Collectors.toList()); // Собираем результат в список

            System.out.println("Even numbers: " + evenNumbers);
        }
    }
}
