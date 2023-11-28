package org.example;

import java.util.ArrayList;
import java.util.ListIterator;

class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(10);
        numbers.add(7);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        numbers.add(2);

        System.out.println("ArrayList: " + numbers);


        ListIterator<Integer> iterate = numbers.listIterator();

        int number1 = iterate.next();
        System.out.println("Next Element: " + number1);


        int index1 = iterate.nextIndex();
        System.out.println("Position of Next Element: " + index1);

        System.out.println("Is there any next element? " + iterate.hasNext());
    }
}