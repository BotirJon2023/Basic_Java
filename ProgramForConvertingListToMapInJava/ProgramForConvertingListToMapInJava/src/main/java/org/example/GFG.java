package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GFG {


    public static void main(String[] args) {


        List<Student>
                lt = new ArrayList<Student>();


        lt.add(new Student(1, "Geeks"));
        lt.add(new Student(2, "For"));
        lt.add(new Student(3, "Geeks"));

        Map<Integer, String> map = new HashMap<>();

        for (Student stu : lt) {
            map.put(stu.getId(), stu.getName());
        }

        System.out.println("Map  : " + map);
    }
}
