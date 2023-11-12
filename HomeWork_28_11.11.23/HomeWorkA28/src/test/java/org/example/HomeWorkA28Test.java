package org.example;


import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.util.Arrays;

import static org.example.HomeWorkA28.filter;

class HomeWorkA28Test {

    @Test
    public void testFilter() throws IOException {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        DirectoryStream.Filter<Integer> evenNumberFilter = new DirectoryStream.Filter<Integer>() {
            @Override
            public boolean accept(Integer entry) throws IOException {
                return entry % 2 == 0;
            }
        };

        Integer[] filteredNumbers = filter(numbers, (Filter<Integer>) evenNumberFilter);
        System.out.println("Filtered even numbers: " + Arrays.toString(filteredNumbers));

        DirectoryStream.Filter<Integer> greaterThanFiveFilter = new DirectoryStream.Filter<Integer>() {
            @Override
            public boolean accept(Integer entry) throws IOException {
                return entry > 5;
            }
        };

        filteredNumbers = filter(numbers, (Filter<Integer>) greaterThanFiveFilter);
        System.out.println("Filtered numbers greater than 5: " + Arrays.toString(filteredNumbers));
    }


    @Test
    void main() throws IOException {
        String[] filteredStrings = filter(new String[]{"One", "Two", "Three"}, s -> s.length() == 3);
        System.out.println("Filtered Strings: " + Arrays.toString(filteredStrings));


        Integer[] filteredIntegers = filter(new Integer[]{0, 1, 2, 3, 4, 5}, i -> i % 2 == 0);
        System.out.println("Filtered Integers: " + Arrays.toString(filteredIntegers));


        long[] filteredIntegersWithAnonymousClass;
        filteredIntegersWithAnonymousClass = new long[0];
        System.out.println("Filtered Integers with Anonymous Class: " + Arrays.toString(filteredIntegersWithAnonymousClass));
    }

    public static <T> T[] filter(T[] array, Filter<T> filter) throws IOException {
        int count = 0;
        for (T element : array) {
            if (filter.accept(element)) {
                count++;
            }
        }

        T[] filteredArray = Arrays.copyOf(array, count);
        int index = 0;
        for (T element : array) {
            if (filter.accept(element)) {
                filteredArray[index++] = element;
            }
        }

        return filteredArray;
    }

    public interface Filter<T> {
        boolean accept(T element) throws IOException;
    }
}
