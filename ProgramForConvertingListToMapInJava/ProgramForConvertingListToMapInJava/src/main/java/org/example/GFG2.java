package org.example;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class GFG2 {


    public static void main(String[] args) {


        List<Student2> lt = new ArrayList<>();

        lt.add(new Student2(1, "Geeks"));
        lt.add(new Student2(2, "For"));
        lt.add(new Student2(3, "Geeks"));

        LinkedHashMap<Integer, String>
                map = lt.stream()
                .collect(
                        Collectors
                                .toMap(
                                        Student2::getId,
                                        Student2::getName,
                                        (x, y)
                                                -> x + ", " + y,
                                        LinkedHashMap::new));


        map.forEach(
                (x, y) -> System.out.println(x + "=" + y));
    }
}


