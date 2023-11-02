package org.example;

import java.util.Arrays;
import java.util.List;

public class S1 {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(32, 1, 6, 5, 4, 9, 87);
        int[] arr = {65, 4, 32, 19, 8, 7};


        list1.stream()
                .filter(digit -> digit % 2 == 0); // 32, 6, 4
        list1.stream().map(el -> el * 10) // 320, 60, 40
                .toList();
        System.out.println(list1);



        List<Integer> list2 = Arrays.asList(32, 1, 6, 5, 4, 9, 87);
         list1.stream()
                .filter(digit -> digit % 2 == 0); // 32, 6, 4
        list1.stream()
                .map(el -> {
                    if (el < 10) {
                        el = el * 11;
                    }
                    return el;
                }) // 320, 60, 40
                .toList();
        System.out.println(list2);

        List<Integer> list4 = list1.stream()
                .distinct()
                .toList();
        System.out.println(list4);

        List<Integer> list5 = list1.stream()
                .filter(el -> el % 2 == 1)
                .sorted()
                .distinct()
                .toList();
        System.out.println(list5);

    }

}
