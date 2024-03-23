package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class GFG {


    public static <T> List<T>
    getListFromIterator(Iterator<T> iterator) {


        List<T> list = new ArrayList<>();


        iterator.forEachRemaining(list::add);


        return list;
    }


    public static void main(String[] args) {


        Iterator<Integer>
                iterator = Arrays.asList(1, 2, 3, 4, 5)
                .iterator();


        List<Integer>
                list = getListFromIterator(iterator);

        System.out.println(list);
    }
}
