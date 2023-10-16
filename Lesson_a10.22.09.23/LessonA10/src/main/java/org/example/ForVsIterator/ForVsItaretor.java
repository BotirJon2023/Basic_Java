package org.example.ForVsIterator;

import java.util.LinkedList;
import java.util.List;

public class ForVsItaretor {

    public static void main(String[] args, List<String> ArrayList) {

        List<String> list1 = new ArrayList<>();
        list1.add("One");
        list1.add("Two");
        list1.add("Three");

        List<String> list2 = new LinkedList<>();
        list2.add("One");
        list2.add("Two");
        list2.add("Three");

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
    }
}
