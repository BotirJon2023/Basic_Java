package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class GFG3 {


    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Enter the file path: ");
        String filename = s.nextLine();
        try {


            FileInputStream fis
                    = new FileInputStream(filename);


            Scanner sc = new Scanner(fis);


            StringBuffer sb = new StringBuffer();
            while (sc.hasNext()) {
                sb.append(sc.nextLine());
            }

            System.out.println(sb.toString());
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
