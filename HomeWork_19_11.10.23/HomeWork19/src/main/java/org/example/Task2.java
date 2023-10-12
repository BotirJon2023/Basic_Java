package org.example;

/*
Дан список целых чисел. Необходимо найти максимальный элемент списка, который делится на заданное число без остатка.

private static void m2() {
        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30);
*/

import java.util.Arrays;
import java.util.List;

public class Task2 {

    private static void findMaxDivisible(List<Integer> list, int x) {
        int maxDivisible = Integer.MIN_VALUE; // Инициализируем максимальное деление минимальным значением

        for (int num : list) {
            if (num % x == 0 && num > maxDivisible) {
                maxDivisible = num;
            }
        }

        if (maxDivisible != Integer.MIN_VALUE) {
            System.out.println("Максимальный элемент, который делится на " + x + " без остатка: " + maxDivisible);
        } else {
            System.out.println("В списке нет элементов, которые делятся на " + x + " без остатка.");
        }
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30);
        int x = 5; // Заданное число

        findMaxDivisible(list, x);
    }
}
