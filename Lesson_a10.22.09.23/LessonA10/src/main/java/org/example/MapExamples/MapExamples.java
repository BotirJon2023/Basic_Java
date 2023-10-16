package org.example.MapExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import static java.lang.System.*;

public class MapExamples {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>(16, 0.75f);
//        Map<Integer, String> map2 = new TreeMap<>();

//        map = map2;

        map.put(1432, "Ivan Ivanov");
        map.put(3231, "Peter Petrov");
        map.put(3231, "New Person");
        map.put(3211, "Mary Smith");

        out.println(map.get(3231));

        Set<Integer> keys = map.keySet();
        for (Integer k = keys) {
            out.println(k);

        }

        System.out.println(map.values());

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> e : entries) {
            System.out.println("key = " + e.getKey() + "value = " + e.getValue());

        }
    }
}
