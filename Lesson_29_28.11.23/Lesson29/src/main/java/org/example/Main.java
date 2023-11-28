package org.example;

import java.io.ByteArrayOutputStream;

class Main {
    public static void main(String[] args) {

        String data = "This is a line of text inside the string.";

        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] array = data.getBytes();


            out.write(array);

            String streamData = out.toString();
            System.out.println("Output stream: " + streamData);

            out.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}