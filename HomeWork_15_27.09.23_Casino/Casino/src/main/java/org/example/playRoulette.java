package org.example;

import java.util.Random;
import java.util.Scanner;

public class playRoulette {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random generator = new Random();
        double total = 500;
        double amount;
        int choice, win = 0, lose = 0, spin = 0;
        int number;
        int rouletteNum;
        int result;
        char response = 'y';
        int resultArr[] = new int[36];

        while (response == 'y' || response == 'Y' && total <= 0) {
            System.out.print("Введите сумму своей ставки: ");
            amount = keyboard.nextDouble();
            System.out.print("0 - Четный\n1 - Нечетный\n2 - Номер\n");
            choice = -1;
            while (choice < 0 || choice > 2) {
                System.out.print("Сделайте свою ставку на: ");
                choice = keyboard.nextInt();
            }
            number = 0;
            if (choice == 2) {
                while (number < 1 || number > 36) {
                    System.out.print("Сделайте свою ставку на номера от 1 до 36): ");
                    number = keyboard.nextInt();
                }
            }
            rouletteNum = generator.nextInt(37);
            spin++;
            System.out.println("Номер рулетки: " + rouletteNum);

            if (choice == 2) {
                if (rouletteNum == number)
                    result = 35;
                else
                    result = 0;
            } else {
                if (rouletteNum == 0 || rouletteNum % 2 != choice)
                    result = 0;
                else
                    result = 1;
            }

            //Print out game result, win/lose amount
            if (result > 0) {
                System.out.println("Поздравляем!!! Вы выиграли!");
                System.out.printf("Ваш выигрыш составил $%.2f \n", result * amount);
                System.out.printf("Здесь Ваши деньги: $%.2f \n",
                        (result + 1) * amount);
                total = (result + 1) * amount + total;
                win++;
                resultArr[rouletteNum]++;

            } else {
                System.out.println("Вы проиграли. Удачи в следующий раз!");
                System.out.printf("Вы проиграли: $%.2f \n",
                        (result + 1) * amount);
                total = total - (result + 1) * (amount);
                lose++;
                resultArr[rouletteNum]++;

                if (total <= 0) {
                    break;
                }
            }

            //Ask for another game
            for (int totals = 1; totals < 36; totals++) {
                if (resultArr[totals] > 0) {
                    System.out.println("Номер " + totals + " выиграл " + resultArr[totals] + " раз.");
                }
            }


            System.out.println("У Вас осталось $" + total + " доступных для ставок.");
            System.out.println("Всего Вы выиграли " + win + " игр.");
            System.out.println("В общей сложности Вы проиграли " + lose + " раз.");
            System.out.println("Рулетку Вы крутили " + spin + " раз.");
            System.out.print("\nХотите ли снова сыграть? (y/n) ");
            response = keyboard.next().charAt(0);
        }
    }
}