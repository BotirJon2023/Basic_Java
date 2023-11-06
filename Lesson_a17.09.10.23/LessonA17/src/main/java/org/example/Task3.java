package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi");

        // Отфильтровать строки, начинающиеся на 'a' и преобразовать в верхний регистр
        List<String> filteredAndUppercase = words.stream()
                .filter(word -> word.startsWith("a"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Отфильтрованные и в верхний регистр:");
        System.out.println(filteredAndUppercase);

        // Получить список слов с уникальными символами
        List<String> uniqueCharacters = words.stream()
                .distinct()
                .filter(word -> word.chars().distinct().count() == word.length())
                .collect(Collectors.toList());

        System.out.println("Слова с уникальными символами:");
        System.out.println(uniqueCharacters);
    }
}
