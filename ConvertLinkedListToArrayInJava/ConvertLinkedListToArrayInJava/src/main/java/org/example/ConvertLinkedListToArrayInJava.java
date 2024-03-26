package org.example;

import java.util.*;

public class ConvertLinkedListToArrayInJava {


    public static <T> Object[] convertLinkedListToArray(LinkedList<T> linkedList)
    {


        Object[] array = linkedList.toArray();

        return array;
    }

    public static void main(String args[])
    {

        LinkedList<String>
                linkedList = new LinkedList<String>();


        linkedList.add("G");
        linkedList.add("e");
        linkedList.add("e");
        linkedList.add("k");
        linkedList.add("s");


        System.out.println("Linked list: "
                + linkedList);


        Object[] objArray = convertLinkedListToArray(linkedList);


        String[] array = Arrays.copyOf(objArray,
                objArray.length,
                String[].class);

        System.out.println("Array: "
                + Arrays.toString(array));
    }

}
