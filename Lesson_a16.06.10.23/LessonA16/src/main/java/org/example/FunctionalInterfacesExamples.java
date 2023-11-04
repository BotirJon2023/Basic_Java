package org.example;

import jdk.internal.icu.util.CodePointMap;

import java.util.Random;
import java.util.function.*;

public class FunctionalInterfacesExamples {

    public static void main(String[] args, CodePointMap.ValueFilter multyplyTo100) {

        Supplier<Integer> randomGenerator = () -> {
            Random random = new Random();
            return random.nextInt();

        };

        Supplier<Integer> positiveIntsGenerator = () -> {
            Random random = new Random();
            return random.nextInt(0, 100);
        };

        System.out.println(randomGenerator.get());
        System.out.println(randomGenerator.get());
        System.out.println(randomGenerator.get());
        System.out.println(positiveIntsGenerator.get());
        System.out.println(positiveIntsGenerator.get());
        System.out.println(positiveIntsGenerator.get());

       // Consumer --- accept

        Consumer<String> printData = (s1) -> System.out.println(s1);
        Consumer<String> printData1 = System.out::println;

        printData.accept("Data 1");
        printData.accept("Data 2");

        // Function --- apply



        Function<Double, Double> multyply = (x) -> x * 100;
        multyplyTo100.apply(10.0);

        // Bifuntion / BinaryOperator --- apply
        BiFunction<Double, Double> multyply = (x, y)
                -> x * y;
        multyply.apply(10.0, 99.0);

        // data --- Predicate --- test

        Predicate<String> isLongEnought = (s) -> s.length() > 5;
        System.out.println(isLongEnought.test("Hello!"));
        System.out.println(isLongEnought.test("Hi!"));

        Function<String, String> processString = (s) -> s.substring(6, 11);
        Function<Object, String> processString2 = processString.compose((s) -> ((String) s).toUpperCase());

                String result = processString.apply("Hello World!");
        System.out.println(result);



    }

}
