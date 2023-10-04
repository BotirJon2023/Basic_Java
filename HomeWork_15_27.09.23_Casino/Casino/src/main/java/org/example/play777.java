package org.example;

import java.util.Random;
import java.util.Scanner;

public class play777 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int balance = 1000; // Начальный баланс
        int bet;

        while (balance > 0) {
            System.out.println("Ваш текущий баланс: " + balance + "долларов");
            System.out.print("Введите вашу ставку: ");

            // Проверка на ввод числа
            while (!scanner.hasNextInt()) {
                System.out.println("Введите корректное число!");
                scanner.next();
            }

            bet = scanner.nextInt();

            if (bet <= 0 || bet > balance) {
                System.out.println("Некорректная ставка. Попробуйте снова.");
                continue;
            }

            int[] reels = new int[3];

            // Случайная генерация значений на барабанах (от 1 до 7)
            for (int i = 0; i < 3; i++) {
                reels[i] = random.nextInt(7) + 1;
            }

            System.out.println("Результат: " + reels[0] + " " + reels[1] + " " + reels[2]);

            if (reels[0] == reels[1] && reels[1] == reels[2]) {
                int winnings = bet * reels[0]; // Выигрыш зависит от выпавшего числа
                System.out.println("Поздравляем! Вы выиграли " + winnings + " долларов.");
                balance += winnings;
            } else {
                System.out.println("Вы проиграли " + bet + " долларов.");
                balance -= bet;
            }
        }

        System.out.println("Игра окончена. Ваш баланс опустел.");
    }
}

