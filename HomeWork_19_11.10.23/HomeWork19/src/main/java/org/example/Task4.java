package org.example;
/*
 * Дана коллекция строк. Необходимо найти все уникальные слова, которые содержатся в
 * этой коллекции строк, и вернуть их в виде списка.

private static void m4() {
        List<String> lines = Arrays.asList(
        "Java is a programming language.",
        "Java is widely used in enterprise applications.",
        "Python is gaining popularity as a data science tool.",
        "Python is a versatile programming language."
        );
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Task4 {

    public class Main {
        public static void main(String[] args) {
            List<String> lines = Arrays.asList(
                    "Java is a programming language.",
                    "Java is widely used in enterprise applications.",
                    "Python is gaining popularity as a data science tool.",
                    "Python is a versatile programming language."
            );

            List<String> uniqueWords = lines.stream()
                    .flatMap(line -> Arrays.stream(line.split("\\s+")))
                    .distinct()
                    .collect(Collectors.toList());

            System.out.println(uniqueWords);
        }
    }
}
