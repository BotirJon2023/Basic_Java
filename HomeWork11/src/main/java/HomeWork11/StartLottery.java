package HomeWork11;

import java.util.Arrays;

public class StartLottery {
    public static void main(String[] args) {
        int[] userNumbers1 = Utils.getUserLotteryNumbers(1);
        int[] userNumbers2 = Utils.getUserLotteryNumbers(2);
        int[] userNumbers3 = Utils.getUserLotteryNumbers(3);
        System.out.println("User 1: " + Arrays.toString(userNumbers1));
        System.out.println("User 2: " + Arrays.toString(userNumbers2));
        System.out.println("User 3: " + Arrays.toString(userNumbers3));

        LotteryEngine lottery = new LotteryEngine();
        lottery.runLottery();
        int[] winnerNumbers = lottery.getLuckyNumbers();
        System.out.println("Winner numbers: " + Arrays.toString(winnerNumbers));

        System.out.println("User 1 matched: " + Utils.compareWinnerNumbers(winnerNumbers, userNumbers1));
        System.out.println("User 2 matched: " + Utils.compareWinnerNumbers(winnerNumbers, userNumbers2));
        System.out.println("User 3 matched: " + Utils.compareWinnerNumbers(winnerNumbers, userNumbers3));
    }
}