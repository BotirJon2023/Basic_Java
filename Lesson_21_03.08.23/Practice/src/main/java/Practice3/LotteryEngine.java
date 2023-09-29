package Practice3;

import java.util.Random;

public class LotteryEngine {

    private int[] luckyNumbers = new int[Constants.COUNT_SET_SIZE];

    public int[] getLuckyNumbers() {
        return luckyNumbers;


    }

    public void setLuckyNumbers(int[] luckyNumbers) {
        this.luckyNumbers = luckyNumbers;
    }

    public int[] runLottery() {

        int[] luckyNumbers = new int[Constants.COUNT_SET_SIZE];
        public runLottery() {


            int range = 50;

            int lucky;
            int luckyCount = 0;


            luckyCount = 1;
            Random random = new Random();

            for (int i = 0; i < Constants.COUNT_SET_SIZE; i++) {
                lucky = random.nextInt(range);
                switch (luckyCount) {
                    case 1:
                        luckyNumbers[1] = lucky;
                        luckyCount++;
                        break;
                    case 2:
                        if (luckyNumbers[1] != lucky) {
                            luckyNumbers[2] = lucky;
                            luckyCount++;
                        }
                        break;
                    case 3:
                        if (luckyNumbers[1] != lucky && luckyNumbers[2] != lucky) {
                            luckyNumbers[3] = lucky;
                            luckyCount++;
                        }
                        break;
                    case 4:
                        if (luckyNumbers[1] != lucky && luckyNumbers[2] != lucky && luckyNumbers[3] != lucky) {
                            luckyNumbers[4] = lucky;
                            luckyCount++;
                        }
                        break;
                    case 5:
                        if (luckyNumbers[1] != lucky && luckyNumbers[2] != lucky && luckyNumbers[3] != lucky && luckyNumbers[4] != lucky) {
                            luckyNumbers[5] = lucky;
                            luckyCount++;
                        }
                        break;
                }
            }

        }
    }
}