package org.example;


import java.io.ByteArrayInputStream;

public class Main {

    public static void main(String args[]) {

        // Creates an array of bytes
        byte[] array = {1, 2, 3, 4, 12, 23, 34, 45, 11, 27, 31, 49};

        try {
            ByteArrayInputStream input = new ByteArrayInputStream(array);


            System.out.println("Available bytes at the beginning: " + input.available());


            input.read();
            input.read();

            System.out.println("Available bytes at the end: " + input.available());

            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}