package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeWork27_4 {

    public static Map<Integer, List<String>> groupNamesByLength(String filePath) {
        Map<Integer, List<String>> groupedNames = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String name = line.trim();

                int length = name.length();
                if (!groupedNames.containsKey(length)) {
                    groupedNames.put(length, new ArrayList<>());
                }
                groupedNames.get(length).add(name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return groupedNames;
    }

    public static void main(String[] args) {
        String filePath = "C:\\Users\\Tel-ran.de\\Desktop\\IT Tel Ran\\Java\\HomeWork_27_10.11.23\\HomeWork27\\src\\main\\java\\org\\example\\1.txt";
        Map<Integer, List<String>> groupedNames = groupNamesByLength(filePath);

        for (Map.Entry<Integer, List<String>> entry : groupedNames.entrySet()) {
            int length = entry.getKey();
            List<String> names = entry.getValue();
            System.out.println("Names with length " + length + ": " + names);
        }
    }
}
