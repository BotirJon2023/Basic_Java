package org.example;

import java.util.Collections;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(100);
        numbers.add(48);
        numbers.add(79);
        numbers.add(32);
        numbers.add(23);
        numbers.add(45);
        numbers.add(43);
        numbers.add(21);


        int min = Collections.min(numbers);
        System.out.println("Minimum Element: " + min);


        int max = Collections.max(numbers);
        System.out.println("Maximum Element: " + max);
    }
}