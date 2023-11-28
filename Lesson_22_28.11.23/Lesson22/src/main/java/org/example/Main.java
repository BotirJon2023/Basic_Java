package org.example;

import java.io.FileInputStream;

public class Main {

    public static void main(String args[]) {

        try {

            FileInputStream input = new FileInputStream("input.txt");


            System.out.println("Available bytes at the beginning: " + input.available());

            input.read();
            input.read();
            input.read();
            input.read();
            input.read();
            input.read();
            input.read();
            input.read();

            System.out.println("Available bytes at the end: " + input.available());

            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
