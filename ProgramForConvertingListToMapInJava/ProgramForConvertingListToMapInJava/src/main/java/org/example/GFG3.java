package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GFG3 {

    public static void main(String[] args) {


        List<Student3> lt = new ArrayList<Student3>();


        lt.add(new Student3(1, "Geeks"));
        lt.add(new Student3(1, "For"));
        lt.add(new Student3(2, "Geeks"));
        lt.add(new Student3(2, "GeeksForGeeks"));

        Map<Integer, List<String>>
                multimap = lt
                .stream()
                .collect(
                        Collectors
                                .groupingBy(
                                        Student3::getId,
                                        Collectors
                                                .mapping(
                                                        Student3::getName,
                                                        Collectors
                                                                .toList())));

        System.out.println("MultiMap = " + multimap);
    }
}
