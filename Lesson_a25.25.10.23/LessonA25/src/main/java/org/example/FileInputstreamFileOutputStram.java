package org.example;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputstreamFileOutputStram {

    public static void main(String[] args) {


        try (FileInputStream inputStream = new FileInputStream("img.png");
        FileOutputStream outputStream = new FileOutputStream("img1.png")) {

            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }

            System.out.println("***DONE***");

        } catch(IOException e){
            throw new RuntimeException(e);
        }

    }

}