package org.example;

public class GFG2 {

    public static void main(String[] args) throws Exception {

        Class c = Class.forName("java.lang.String");


        System.out.println("class name: " + c.getName());


        System.out.println("super class name: "
                + c.getSuperclass().getName());
    }

}
