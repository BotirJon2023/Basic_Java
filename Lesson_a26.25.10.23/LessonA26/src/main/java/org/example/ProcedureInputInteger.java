package org.example;

import java.util.Scanner;

public class ProcedureInputInteger {

    static int inPutInt() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int num = scanner.nextInt();

        return num;
    }

    public static void main(String[] args) {

    }

    public class Main {
        public static void main(String[] args) {
            inputNumbers();
        }

        public static void inputNumbers() {
            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            int previousNumber = 0;
            int previousSum = 0;
            int count = 0;

            System.out.println("Введите целые числа (для завершения введите 0):");

            while (true) {
                int number = scanner.nextInt();

                if (number == 0) {
                    break;
                }

                sum += number;
                previousSum += previousNumber;
                previousNumber = number;
                count++;

                System.out.println("Сумма на текущее число: " + sum);
                System.out.println("Сумма на предыдущее число: " + previousSum);
                System.out.println("Сумма на предыдущие числа: " + (previousSum + sum));
                System.out.println("Среднее арифметическое: " + (sum / count));
            }
        }
    }
}
