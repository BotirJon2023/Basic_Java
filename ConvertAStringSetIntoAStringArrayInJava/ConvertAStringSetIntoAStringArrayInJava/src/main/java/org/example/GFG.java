package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GFG {

    public static String[] convert(Set<String> setOfString) {


        String[] arrayOfString = new String[setOfString.size()];


        int index = 0;
        for (String str : setOfString)
            arrayOfString[index++] = str;


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
