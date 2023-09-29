package Practice3;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class StartLottery {

    public static void main(String[] args) {

        int[] userNumbers = Utils.getUserLotteryNumbers();
        System.out.println(Arrays.toString(userNumbers));

        int[] winnersNumber;
        System.out.println("Совпало = " + Utils.compareWinnerNumbers(winnersNumber, userNumbers));

    }

}
