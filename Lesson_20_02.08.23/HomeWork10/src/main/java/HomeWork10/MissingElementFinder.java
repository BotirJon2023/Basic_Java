package HomeWork10;

import java.lang.reflect.Array;


    public class MissingElementFinder {

        public static int findMissingElement(int[] arr, int n) {
            // Рассчитываем ожидаемую сумму
            int expectedSum = n * (n + 1) / 2;

            // Вычисляем сумму элементов массива
            int actualSum = 0;
            for (int num : arr) {
                actualSum += num;
            }

            // Находим недостающий элемент
            return expectedSum - actualSum;
        }

        public static void main(String[] args) {
            int[] arr1 = {1, 2, 3, 5};
            int n1 = arr1.length + 1;
            int missingElement1 = findMissingElement(arr1, n1);
            System.out.println("Недостающий элемент в массиве arr1: " + missingElement1); // Ожидаемый вывод: 4

            int[] arr2 = {6, 1, 2, 8, 3, 4, 7, 10, 5};
            int n2 = arr2.length + 1;
            int missingElement2 = findMissingElement(arr2, n2);
            System.out.println("Недостающий элемент в массиве arr2: " + missingElement2); // Ожидаемый вывод: 9
        }
    }

