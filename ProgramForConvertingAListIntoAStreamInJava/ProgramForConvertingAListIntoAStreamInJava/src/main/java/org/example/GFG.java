package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class GFG {

    private static <T> Stream<T> convertListToStream(List<T> list) {
        return list.stream();
    }

    public static void main(String args[]) {

        List<String> list = Arrays.asList("GeeksForGeeks",
                "A computer portal",
                "for Geeks");

        System.out.println("List: " + list);

        Stream<String> stream = convertListToStream(list);

        System.out.println("Stream from List: "
                + Arrays.toString(stream.toArray()));
    }
}
