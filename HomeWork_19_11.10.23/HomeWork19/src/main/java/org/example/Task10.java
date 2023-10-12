package org.example;

/*
 Задача 1.txt: Найти k-ую перестановку из n элементов
     * Дано число n и число k, необходимо найти k-ую перестановку из n элементов.

 */

import java.util.ArrayList;
import java.util.List;

public class Task10 {

    public class PermutationFinder {

        public static String findKthPermutation(int n, int k) {
            List<Integer> numbers = new ArrayList<>();
            StringBuilder result = new StringBuilder();

            // Заполняем список числами от 1 до n
            for (int i = 1; i <= n; i++) {
                numbers.add(i);
            }

            int factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }

            k--; // Уменьшаем k на 1, чтобы индексация начиналась с 0

            for (int i = 1; i <= n; i++) {
                factorial /= (n - i + 1);
                int index = k / factorial;
                result.append(numbers.get(index));
                numbers.remove(index);
                k -= index * factorial;
            }

            return result.toString();
        }

        public static void main(String[] args) {
            int n = 4;
            int k = 9;
            String kthPermutation = findKthPermutation(n, k);
            System.out.println("k-ая перестановка: " + kthPermutation);
        }
    }
}
