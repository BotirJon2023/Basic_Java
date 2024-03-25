package org.example;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class GFG2 {

    public static void main(String[] args)
    {

        Vector<String> vec = new Vector<String>();


        vec.add("1");
        vec.add("2");
        vec.add("3");
        vec.add("4");
        vec.add("5");



        System.out.println("Vector: " + vec);


        List<String>
                list = Collections.unmodifiableList(vec);


        System.out.println("List:" + list);
    }
}
