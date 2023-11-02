package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Stream1 {

    private static Consumer<? super String> el;

    public static void main(String[] args) {
        List<String> name = Arrays.asList("Q", "W", "S", "X");
        name.forEach(System.out::println);
        name.forEach((el) -> System.out.println(el));

    }
}
