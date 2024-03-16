package org.example;

public class GFG {
    public static void main(String[] args) {

        String s = "GeeksForGeeks";


        Object object = s;


        System.out.println("Datatype of the variable in object is : "
                + object.getClass().getName());

        System.out.println("object is : " + object);
    }
}
