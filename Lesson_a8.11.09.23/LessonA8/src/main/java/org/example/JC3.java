package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JC3 {
    public static void main(String[] args) {
        String[] strings = {"Collection", "Hierarchy", "in", "Java", "defines", "the", "relationships"};

        for (int i = 0; i < strings.length; i++) {
            String el = strings[i];
            if(el.toLowerCase().startsWith("h")) {
                System.out.println(el);
            }
        }
        System.out.println(Arrays.toString(strings));

        List<String> list = new ArrayList<>();
        list.add("Collection");
        list.add("Hierarchy");
        list.add("in");
        list.add("Java");
        list.add("defines");
        list.add("the");
        list.add("relationships");

        for (int i = 0; i < list.size(); i++) {
            String el = list.get(i);
            if(el.toLowerCase().startsWith("h")) {
                System.out.println(el);
            }
        }
    }

    void doTest(List<String> list) {
        System.out.println(list);
    }
}