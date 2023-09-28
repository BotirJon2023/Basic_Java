package UnitTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UnitsTest {



    @Test
    void getNumberTrueElement() {
        int[] expArr = {1, 2, 3};
        int[] testArr = Units.getNumber();

        assertEquals(3, testArr.length);

    }

    @Test
    void getNumberTestEquals() {
        int[] expArr = {1, 2, 3};
        int[] testArr = Units.getNumber();

        assertEquals(3, testArr.length);
        assertArrayEquals(expArr, testArr);
        assertEquals(2, testArr[1]);
        int i = 10;
        System.out.println(i);

    }


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getNumber() {
    }

    @Test
    void findMaxArrayEmpty() {
        int[] testArray = {};
        assertEquals(0, Units.findMax(testArray));

    }

    @Test
    void findMaxArrayTrueResult() {
        int[] testArray = {1, 9, 3, 8, -1};
        assertEquals(9, Units.findMax(testArray));
    }

}