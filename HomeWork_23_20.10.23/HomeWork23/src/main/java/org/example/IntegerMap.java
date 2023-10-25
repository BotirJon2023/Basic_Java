package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class IntegerMap {


    public static Map<Boolean, List<Integer>> getMap() {
        return IntStream.range(0, 100)
                .boxed()
                .collect(Collectors.partitioningBy(i -> i % 3 == 0, Collectors.toList()));
    }

}
