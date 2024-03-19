package org.example;

import java.io.*;
import java.util.Scanner;

public class InputStreamReaderDemo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the file path: ");
        String filename = s.nextLine();


        File file = new File(filename);
        try {

            InputStream is = new FileInputStream(file);


            InputStreamReader isr = new InputStreamReader(is);


            char charArray[] = new char[(int) file.length()];


            isr.read(charArray);

            String contents = new String(charArray);
            System.out.println(contents);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
