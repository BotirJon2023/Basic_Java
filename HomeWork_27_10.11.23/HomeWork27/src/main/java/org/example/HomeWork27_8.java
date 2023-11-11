package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class HomeWork27_8 {

    public static void main(String[] args) {
        String fileName = "C:\\Users\\Tel-ran.de\\Desktop\\IT Tel Ran\\Java\\HomeWork_27_10.11.23\\HomeWork27\\src\\main\\java\\org\\example\\1.txt";
        List<String> names = readNamesFromFile(fileName);
        double averageLength = calculateAverageNameLength(names);
        System.out.println("Средняя длина имени: " + averageLength);
    }

    public static List<String> readNamesFromFile(String fileName) {
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

    public static double calculateAverageNameLength(List<String> names) {
        int totalLength = 0;
        for (String name : names) {
            totalLength += name.length();
        }
        return (double) totalLength / names.size();
    }
}
