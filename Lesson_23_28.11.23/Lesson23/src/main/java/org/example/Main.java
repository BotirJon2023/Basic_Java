package org.example;


import java.io.FileInputStream;

public class Main {

    public static void main(String args[]) {

        try {
            FileInputStream input = new FileInputStream("input.txt");

            input.skip(5);
            System.out.println("Input stream after skipping 5 bytes:");

            int i = input.read();
            while (i != -1) {
                System.out.print((char) i);

                i = input.read();
            }

            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}