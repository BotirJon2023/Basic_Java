package org.example;

import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(7);
        numbers.add(9);

        System.out.println("Sorted ArrayList: " + numbers);

        // Using the shuffle() method
        Collections.shuffle(numbers);
        System.out.println("ArrayList using shuffle: " + numbers);

    }
}