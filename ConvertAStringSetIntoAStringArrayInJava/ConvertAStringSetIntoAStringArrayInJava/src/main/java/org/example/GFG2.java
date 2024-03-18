package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GFG2 {

    public static String[] convert(Set<String> setOfString) {


        String[] arrayOfString = setOfString
                .toArray(new String[0]);


        return arrayOfString;
    }

    public static void main(String[] args) {


        Set<String>
                setOfString = new HashSet<>(
                Arrays.asList("Geeks",
                        "ForGeeks",
                        "A Computer Portal"));


        System.out.println("Set of String: "
                + setOfString);


        String[] arrayOfString = convert(setOfString);


        System.out.println("Array of String: "
                + Arrays.toString(arrayOfString));
    }
}
