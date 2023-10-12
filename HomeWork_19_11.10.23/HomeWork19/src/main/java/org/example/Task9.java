package org.example;

/*

 * Есть два списка list1 и list2, и мы
 * хотим получить все возможные комбинации сумм чисел из обоих списков.
 * Мы используем flatMap, чтобы преобразовать каждый элемент из list1 в поток,
 * затем применяем map, чтобы создать поток сумм чисел из list1 и list2,
 * и наконец, собираем все значения в combinedList.
 * Результат: Combined list: [5, 6, 7, 6, 7, 8, 7, 8, 9].
              List<Integer> list1 = Arrays.asList(1, 2, 3);
              List<Integer> list2 = Arrays.asList(4, 5, 6);

 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Task9 {

    public class Main {
        public static void main(String[] args) {
            List<Integer> list1 = Arrays.asList(1, 2, 3);
            List<Integer> list2 = Arrays.asList(4, 5, 6);

            List<Integer> combinedList = list1.stream()
                    .flatMap(num1 -> list2.stream()
                            .map(num2 -> num1 + num2))
                    .collect(Collectors.toList();



            System.out.println("Combined list: " + combinedList);
        }
    }
}
