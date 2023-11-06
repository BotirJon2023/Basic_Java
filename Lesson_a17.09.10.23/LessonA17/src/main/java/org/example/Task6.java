package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Task6 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("John", 25), new Person("Alice", 22), new Person("Bob", 30));

        List<String> sortedNamesByAge = people.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println(sortedNamesByAge);
    }
}