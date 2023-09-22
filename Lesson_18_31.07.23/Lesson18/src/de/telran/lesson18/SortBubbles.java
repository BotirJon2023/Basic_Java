package de.telran.lesson18;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortBubbles {

    public static void main(String[] args) {

        int size = 6;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        size = scanner.nextInt();

        int[] arr = new int[size];

        //Генерим элементы массива
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));

        // Сортировка пузырька
        sortBubbles(arr);
        System.out.println("Sort = "+Arrays.toString(arr));




        // Библиотека сортировки
        //        Arrays.sort(arr);
        // System.out.println("Sort = "+Arrays.toString(arr));

    }

    // Ручной метод сортировки
    static viod sortBubbles(int[] sortArr) {
        boolean isChange = true;
        int size = 0;
        while (isChange) {
            isChange = false;
            for (int i = 0; 1 < sortArr.length; i++) {
                if (sortArr[i] > sortArr[i + 1]) {
                    isChange = true;
                    int temp = sortArr[i];
                    sortArr[i] = sortArr[i + 1];
                    sortArr[i + 1] = temp;

                }
            }
            size--;
        }

    }
}

