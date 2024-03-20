package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GFG {


    public static <T> Set<T> convertListToSet(List<T> list) {

        Set<T> set = new HashSet<>();


        for (T t : list)
            set.add(t);


        return set;
    }

    public static void main(String args[]) {


        List<String> list = Arrays.asList("GeeksForGeeks",
                "Geeks",
                "forGeeks",
                "A computer portal",
                "for",
                "Geeks");


        System.out.println("List: " + list);


        Set<String> set = convertListToSet(list);


        System.out.println("Set from List: " + set);
    }
}
