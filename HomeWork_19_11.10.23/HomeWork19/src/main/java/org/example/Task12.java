package org.example;

/*

Для людей-индиго:

 Найти сумму квадратов простых чисел, которые являются палиндромами в заданном диапазоне.

 */

import java.util.ArrayList;
import java.util.List;

public class Task12 {


    public class PrimePalindromeSum {
        public static void main(String[] args) {
            int start = 1;
            int end = 1000; // Задайте свой диапазон

            long sum = 0;
            for (int number = start; number <= end; number++) {
                if (isPalindrome(number) && isPrime(number)) {
                    sum += (long) number * number;
                }
            }

            System.out.println("Сумма квадратов простых палиндромных чисел в заданном диапазоне: " + sum);
        }

        // Проверка, является ли число палиндромом
        public static boolean isPalindrome(int number) {
            String strNumber = String.valueOf(number);
            return strNumber.equals(new StringBuilder(strNumber).reverse().toString());
        }

        // Проверка, является ли число простым
        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
