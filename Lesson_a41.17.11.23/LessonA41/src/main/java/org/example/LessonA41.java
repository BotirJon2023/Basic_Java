package org.example;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

import static sun.util.locale.LocaleMatcher.filter;

public class LessonA41 {

    public static void main(String[] args) {
        String filtred = filter(new String[]{"One", "Two", "Three"}, o1 -> o1.length() == 3);
        Integer[] filteredInts = filter(new Integer[]{0, 1, 2, 3, 4, 5}, i -> (i % 2 == 0));

        System.out.println(Arrays.toString(filtred));
        System.out.println(Arrays.toString(filteredInts));

//        Integer[] filteredInts = filter(new Integer[]{1, 2, 3, 4, 5}, new Filter<Integer> {
//
//            @Override
//            public boolean apply(Integer i) {
//                return (i % 2 == 0);
//            }
//        });


    }


    public static <T> T[] filter(T[] t, Filter<T> filter) {
        int newSize = 0;
        for (int i = 0; i < t.length; i++) {
            if (filter.apply(t[i])) t[newSize++] = t[i];

        }
        T[] filtered = Arrays.copyOf(t, newSize++);
        return filtered;
    }

    public static <T> T[] filter2(T[] t, Predicate<? super> filter) {
        int newSize = 0;
        for (int i = 0; i < t.length; i++) {
            if (filter.test(t[i])) t[newSize++] = t[i];

        }
        return Arrays.copyOf(t, newSize);


    }
}
