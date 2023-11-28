package org.example;


import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileOutputStream out = null;
        String data = "This is demo of flush method";

        try {
            out = new FileOutputStream(" flush.txt");

            out.write(data.getBytes());

            out.flush();
            out.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}