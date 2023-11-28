package org.example;


import java.util.ArrayList;
import java.util.ListIterator;

class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(32);
        numbers.add(99);
        numbers.add(88);
        numbers.add(66);
        numbers.add(77);
        numbers.add(27);
        numbers.add(52);
        numbers.add(43);

        System.out.println("ArrayList: " + numbers);

        ListIterator<Integer> iterate = numbers.listIterator();
        iterate.next();
        iterate.next();


        int number1 = iterate.previous();
        System.out.println("Previous Element: " + number1);


        int index1 = iterate.previousIndex();
        System.out.println("Position of the Previous element: " + index1);
    }
}