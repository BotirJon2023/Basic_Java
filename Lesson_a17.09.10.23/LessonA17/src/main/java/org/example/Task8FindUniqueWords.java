package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task8FindUniqueWords {

    public static List<String> getWordsWithUniqueCharacters(List<String> inputList) {
        return inputList.stream()
                .filter(word -> word.chars().distinct().count() == word.length())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> wordsList = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi", "cherry", "kiwi");
        List<String> uniqueWordsList = getWordsWithUniqueCharacters(wordsList);
        System.out.println("Words with unique characters: " + uniqueWordsList);
    }
}