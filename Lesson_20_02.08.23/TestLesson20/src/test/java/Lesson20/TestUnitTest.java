package Lesson20;

import UnitTest.Units;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestUnitTest {

@Test
    void getNumberTest() {
    int[] testArr = Units.getNumber();
    assertEquals(3, testArr.length);

}

}
