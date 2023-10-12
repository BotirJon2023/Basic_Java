package org.example;

/*
Определите все символьные строки максимальной длины в заданном конечном потоке символьных строк. через Optional
             Stream<String> stream = Stream.of("we", "wee", "qwer", "oooo");
             Optional<Map.Entry<Integer, List<String>>> max =
 */


import java.util.List;
import java.util.Map;
import java.util.AbstractMap;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import static java.lang.ConditionalSpecialCasing.entry;
import static java.util.Arrays.stream;

public class Task6 {

    Stream<String> stream = Stream.of("we", "wee", "qwer", "oooo");

    Optional<Map.Entry<Integer, List<String>>> max = stream.collect(
            Collectors.groupingBy(
                    String::length,
                    Collectors.toList()
            )
    ).entrySet().stream().max(
            Map.Entry.comparingByKey()
    );

max.ifPresent(entry ->

    {
        System.out.println("Максимальная длина: " + entry.getKey());
        System.out.println("Максимальные строки: " + entry.getValue());
    });
}