package TestLottery;

import HomeWork11.Constants;
import HomeWork11.LotteryEngine;
import org.junit.Test;
import static org.junit.Assert.*;

public class LotteryEngineTest {
    @Test
    public void testRunLottery() {
        LotteryEngine lotteryEngine = new LotteryEngine();
        lotteryEngine.runLottery();
        int[] luckyNumbers = lotteryEngine.getLuckyNumbers();
        assertNotNull(luckyNumbers);
        assertEquals(Constants.COUNT_SET_SIZE, luckyNumbers.length);
    }
}