package org.example;


import java.io.ByteArrayInputStream;

public class Main {

    public static void main(String args[]) {

        // Create an array of bytes
        byte[] array = {1, 2, 3, 4};
        try {
            ByteArrayInputStream input = new ByteArrayInputStream(array);


            input.skip(2);
            System.out.print("Input stream after skipping 2 bytes: ");

            int data = input.read();
            while (data != -1) {
                System.out.print(data + ", ");
                data = input.read();
            }

            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}