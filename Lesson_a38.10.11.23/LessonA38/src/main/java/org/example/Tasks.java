package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tasks {

    public static void main(String[] args) {
        List<Integer> integers = makeList(new Integer[]{1, 2, 3});
        List<Integer> strings = makeList(new String[]{"A", "B", "C"});


        Integer[] integersArray = makeArray(Arrays.asList(1, 2, 3));
        String[] stringsArray = makeArray(Arrays.asList("A", "B", "C"));

    }

    private static <T> List<Integer> makeList(String[] ints) {
       List<T> list = new ArrayList<>();
       List<T> list1 = new ArrayList();
        return null;
    }

    public static Integer[] makeArray(List<Integer> list) {
        T[] ts = new T[];


        return new Integer[0];
    }
}