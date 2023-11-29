package org.example;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.reverseString("Moscow"));


        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(calculator.productOfArray(array));

        System.out.println(calculator.sumOfDigits(777));

    }


}