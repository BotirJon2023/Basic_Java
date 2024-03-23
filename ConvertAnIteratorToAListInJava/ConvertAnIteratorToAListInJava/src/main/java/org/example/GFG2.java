package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
public class GFG2 {


    public static <T> List<T>
    getListFromIterator(Iterator<T> iterator)
    {


        Iterable<T> iterable = () -> iterator;


        List<T> list = StreamSupport
                .stream(iterable.spliterator(), false)
                .collect(Collectors.toList());


        return list;
    }


    public static void main(String[] args)
    {


        Iterator<Integer>
                iterator = Arrays.asList(1, 2, 3, 4, 5)
                .iterator();


        List<Integer>
                list = getListFromIterator(iterator);

        System.out.println(list);
    }
}
