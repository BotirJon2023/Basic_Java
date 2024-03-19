package org.example;

import java.io.*;
import java.util.Scanner;

public class GFG {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the file path: ");
        String filename = s.nextLine();
        try {

            InputStream is = new FileInputStream(filename);


            InputStreamReader isr
                    = new InputStreamReader(is);


            BufferedReader br = new BufferedReader(isr);
            StringBuffer sb = new StringBuffer();

            String str;

            while ((str = br.readLine()) != null) {
                sb.append(str);
            }
            System.out.println(sb.toString());
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
