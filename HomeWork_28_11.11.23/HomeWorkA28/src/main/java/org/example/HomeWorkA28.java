package org.example;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWorkA28 {

    public static <T> T[] filter(T[] array, DirectoryStream.Filter<T> filter) {
        List<T> resultList = new ArrayList<>();
        for (T element : array) {
            try {
                if (filter.accept(element)) {
                    resultList.add(element);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        // Convert the List to an array of the same type
        @SuppressWarnings("unchecked")
        T[] resultArray = (T[]) resultList.toArray(new Object[0]);
        return resultArray;
    }

    public static void main(String[] args) {
        // Example 1: Filtering strings based on length
        String[] filteredStrings = filter(new String[]{"One", "Two", "Three"}, s -> s.length() == 3);
        System.out.println("Filtered Strings: " + Arrays.toString(filteredStrings));

        // Example 2: Filtering integers based on even values
        Integer[] filteredIntegers = filter(new Integer[]{0, 1, 2, 3, 4, 5}, i -> i % 2 == 0);
        System.out.println("Filtered Integers: " + Arrays.toString(filteredIntegers));

        // Example 3: Using an anonymous class for filtering
        Integer[] filteredIntegersWithAnonymousClass = filter(new Integer[]{0, 1, 2, 3, 4, 5}, new DirectoryStream.Filter<Integer>() {
            @Override
            public boolean accept(Integer entry) throws IOException {
                return false;
            }


        });
        System.out.println("Filtered Integers with Anonymous Class: " + Arrays.toString(filteredIntegersWithAnonymousClass));
    }
}
