package org.example;

import java.util.List;


public class Sum {


    public static int getSum(List<Integer> integers) {
        int oddSum = integers.stream()
                .filter(i -> i % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();

        return oddSum;
    }

}
