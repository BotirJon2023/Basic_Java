package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task5UniqueWordsExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi", "cherry", "kiwi");

        List<String> uniqueWords = words.stream()
                .filter(word -> word.length() > 4)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueWords);
    }
}
