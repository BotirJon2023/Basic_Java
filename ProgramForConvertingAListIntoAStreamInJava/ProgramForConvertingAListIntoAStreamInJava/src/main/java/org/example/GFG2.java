package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class GFG2 {

    public static void main(String args[]) {

        List<String> list = Arrays.asList("GeeksForGeeks",
                "A computer portal",
                "for",
                "Geeks");

        System.out.println("List: " + list);

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {

                return s.startsWith("G");
            }
        };

        System.out.println("Stream from List with items" +
                " starting with G: ");

        list.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }

}
