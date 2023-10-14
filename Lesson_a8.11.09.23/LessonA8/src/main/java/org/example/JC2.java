package org.example;

import java.util.ArrayList;
import java.util.List;

public class JC2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(1_000_000);
        list.add(5);
        list.add(25);
        list.add(53);
        list.add(54);
        list.add(555);

        System.out.println(list.contains(66));
        System.out.println(list.get(0));
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

class S {
    Object[] objects;

    void add(Object o) {

    }
}