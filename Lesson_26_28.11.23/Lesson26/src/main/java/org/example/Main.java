package org.example;

import java.io.ByteArrayInputStream;

public class Main {
    public static void main(String[] args) {

        byte[] array = {1, 2, 3, 4, 13, 24, 35, 46};

        try {
            ByteArrayInputStream input = new ByteArrayInputStream(array);

            System.out.print("The bytes read from the input stream: " + array);

            for(int i= 0; i < array.length; i++) {

                int data = input.read();
                System.out.print(data + ", ");
            }
            input.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }
}