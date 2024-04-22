package org.example;

public class StringCheckIfUpperCase2 {

    public static void main(String[] args) {

        String str = "UPPERCASE STRING";

        if( str.equals(str.toUpperCase()) )
            System.out.println("String is uppercase");
        else
            System.out.println("String is not uppercase");

    }
}
