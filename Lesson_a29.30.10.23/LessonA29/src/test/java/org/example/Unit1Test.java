package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Unit1Test {

    private Unit1 unit = new Unit1();

    @Test
    void devidePositiveTest() {

        double a = 10;
        double b = 10;
        double expected = 1;
        Assertions.assertEquals(expected, unit.devide(a, b));
    }


    @Test
    void devideByZeroTest() {
        double a = 10;
        double b = 0;
        Assertions.assertThrows(ArithmeticException.class, () -> unit.devide(a, b));

    }

}