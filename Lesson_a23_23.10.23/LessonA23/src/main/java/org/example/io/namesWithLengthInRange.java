package org.example.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class namesWithLengthInRange {

    public static void main(String[] args) {
        List<String> names = namesWithLengthInRange("names.txt", 5, 10);
        System.out.println(names);
    }

    public static List<String> namesWithLengthInRange(String fileName, int minLength, int maxLength) {
        List<String> names = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.length() >= minLength && line.length() <= maxLength) {
                    names.add(line);
                }
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return names;
    }
}


