package org.example;

public class SimleMockExample {

    public int sum(int a, int b) {
        return a + b;

    }

    public int mult(int a, int b) {
        return a * b;

    }

    public String calculate(int a) {
        int result = mult(10, 10) + sum(10, 10);
        return "" + (result * a); // все превращается в String
        // (10 + 5 * (14/2 + 5)) * 7 - 11 - рекурсивный спуск
    }


}
