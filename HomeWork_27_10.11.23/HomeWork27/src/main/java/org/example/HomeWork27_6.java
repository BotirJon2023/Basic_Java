package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomeWork27_6 {

    public static void main(String[] args) {
        List<String> names = readNamesFromFile("C:\\Users\\Tel-ran.de\\Desktop\\IT Tel Ran\\Java\\HomeWork_27_10.11.23\\HomeWork27\\src\\main\\java\\org\\example\\1.txt");
        List<String> reverseSortedNames = reverseSortNames(names);

        System.out.println(reverseSortedNames);
    }

    static List<String> readNamesFromFile(String fileName) {
        List<String> names = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                names.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return names;
    }

    static List<String> reverseSortNames(List<String> names) {
        Collections.sort(names, Collections.reverseOrder());
        return names;
    }
}
