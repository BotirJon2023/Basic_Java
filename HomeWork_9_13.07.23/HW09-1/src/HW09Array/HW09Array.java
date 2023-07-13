package HW09Array;

import java.util.Arrays;
import java.util.Random;

public class HW09Array {

    public static void main(String[] args) {

        int[] array = new int[5];
        Random random = new Random();

        // Заполнение массива случайными числами
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10; // Генерация случайного числа от 10 до 99
        }

        // Вывод массива на консоль
        System.out.println("Массив: " + Arrays.toString(array));

        // Проверка, является ли массив строго возрастающей последовательностью
        boolean isIncreasing = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        // Вывод результата
        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}

