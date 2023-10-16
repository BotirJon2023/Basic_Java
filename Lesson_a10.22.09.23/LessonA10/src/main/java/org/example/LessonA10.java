package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LessonA10 {
    public static void main(String[] args, Integer[] integers) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Jenny");
        names.add("Mary");
        names.add("Harry");
        names.add("Jack");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String current = iterator.next();
            System.out.println(current);
            if (current.equals("Marry")) iterator.remove();
        }
        System.out.println("After remove opration");
        iterator = names.iterator();
        while (iterator.hasNext()) {
            String current = iterator.next();
            System.out.println(current);
        }
        for (String s : names) {
            System.out.println(s);
        }

        List<Integer> integers = new ArrayList<>();
        integers.add(100);
        integers.add(200);
        integers.add(300);
        integers.add(400);
        integers.add(500);
        integers.add(600);
        integers.add(700);
        integers.add(800);
        integers.add(900);
        integers.add(1000);


        ListIterator<Integer> listInteger = integers.listIterator();
        while (listInteger.hasNext()) {
            Integer next = listInteger.next();
            if (next == 300) {
                listInteger.previous();
                listInteger.previous();
                listInteger.set(3000);
                listInteger.next();
                listInteger.next();
            }
            for (Integer i : integers) {
                System.out.println(i);
            }
        }
    }
}