package Practice2;

import java.util.Random;
import java.util.Scanner;

public class Lottery2Case {

    public static void main(String[] args) {

        int setSize = 5;
        int range = 50;

        int lucky;
        int luckyCount = 0;

        int lucky1 = 0;
        int lucky2 = 0;
        int lucky3 = 0;
        int lucky4 = 0;
        int lucky5 = 0;

        int userNum1;
        int userNum2;
        int userNum3;
        int userNum4;
        int userNum5;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1-й номер от 1 до " + range + " номера не должны повторятся: ");
        userNum1 = scanner.nextInt();
        do {
            System.out.println("Введите 1-й номер от 1 до " + range);
            userNum1 = scanner.nextInt();
        } while (userNum1 <= 0 && userNum1 > 50);
        System.out.println("Введите 2-й номер от 1 до " + range);
        userNum2 = scanner.nextInt();
        do {
            System.out.println("Введите 2-й номер от 1 до " + range);
            userNum2 = scanner.nextInt();
        } while (userNum2 <= 0 && userNum2 > 50);

        System.out.println("Введите 3-й номер от 1 до " + range);
        userNum3 = scanner.nextInt();
        do {
            System.out.println("Введите 3-й номер от 1 до " + range);
            userNum3 = scanner.nextInt();
        } while (userNum3 <= 0 && userNum3 > 50);

        System.out.println("Введите 4-й номер от 1 до " + range);
        userNum4 = scanner.nextInt();
        do {
            System.out.println("Введите 4-й номер от 1 до " + range);
            userNum4 = scanner.nextInt();
        } while (userNum4 <= 0 && userNum4 > 50);

        System.out.println("Введите 5-й номер от 1 до " + range);
        userNum5 = scanner.nextInt();
        do {
            System.out.println("Введите 5-й номер от 1 до " + range);
            userNum5 = scanner.nextInt();
        } while (userNum5 <= 0 && userNum5 > 50);

        luckyCount = 1;
        Random random = new Random();

        for (int i = 0; i < setSize; i++) {
            lucky = random.nextInt(range);
            switch (luckyCount) {
                case 1:
                    lucky1 = lucky;
                    luckyCount++;
                    break;
                case 2:
                    if (lucky1 != lucky) {
                        lucky2 = lucky;
                        luckyCount++;
                    }
                    break;
                case 3:
                    if (lucky1 != lucky && lucky2 != lucky) {
                        lucky3 = lucky;
                        luckyCount++;
                    }
                    break;
                case 4:
                    if (lucky1 != lucky && lucky2 != lucky && lucky3 != lucky) {
                        lucky4 = lucky;
                        luckyCount++;
                    }
                    break;
                case 5:
                    if (lucky1 != lucky && lucky2 != lucky && lucky3 != lucky && lucky4 != lucky) {
                        lucky5 = lucky;
                        luckyCount++;
                    }
                    break;
            }
        }
        System.out.println("Выигрышные номера: " + lucky1 + "," + lucky2 + "," + lucky3 + "," + lucky4 + "," + lucky5);
        System.out.println("Номера пользователя: " + userNum1 + "," + userNum2 + "," + userNum3 + "," + userNum4 + "," + userNum5);
    }
}
