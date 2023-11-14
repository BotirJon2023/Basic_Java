package org.example.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class countNamesContainingSubstring {

    public static void main(String[] args) {
        String fileName = "names.txt";
        String substring = "John";
        long count = countNamesContainingSubstring(fileName, substring);
        System.out.println("Number of names containing \"" + substring + "\" is: " + count);
    }

    public static long countNamesContainingSubstring(String fileName, String substring) {
        long count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("names.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(substring)) {
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return count;
    }
}
