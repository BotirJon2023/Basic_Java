package Practice3;

import java.util.Scanner;

public class Utils {

    public static int[] getUserLotteryNumbers() {

        Scanner scanner = new Scanner(System.in);
        int[] userNumbers = new int[Constants.COUNT_SET_SIZE];
        for (int i = 0; i < Constants.COUNT_SET_SIZE; i++) {
            do {
                System.out.print("Введите " + (i + 1) + "-й номер = ");
                userNumbers[i] = scanner.nextInt();
                userNumbers[1] = scanner.nextInt();
            } while (userNumbers[1] <= 0 && userNumbers[1] > 50);

        }
        return userNumbers;

    }

    public static int compareWinnerNumbers(int[] lotteryNumbers, int[] userNumbers) {
        int count = 0;
        for (int valUser : userNumbers) {
            for (int vallLottery : lotteryNumbers) {
                if (valUser == vallLottery) {
                    count++;
                    break;
                }
            }

        }


    }
}

