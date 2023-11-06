package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1.txt", "2", "3", "4", "5");

        List<Integer> numbers = strings.stream()
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        System.out.println(numbers);
    }
}