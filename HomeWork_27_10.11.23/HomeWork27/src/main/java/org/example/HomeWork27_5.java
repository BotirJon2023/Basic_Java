package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HomeWork27_5 {

    public static void main(String[] args) {
        Set<String> uniqueSurnames = findUniqueSurnamesFromFile("C:\\Users\\Tel-ran.de\\Desktop\\IT Tel Ran\\Java\\HomeWork_27_10.11.23\\HomeWork27\\src\\main\\java\\org\\example\\1.txt");
        System.out.println(uniqueSurnames);
    }

    public static Set<String> findUniqueSurnamesFromFile(String filename) {
        Set<String> uniqueSurnames = new HashSet<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String[] surnames = scanner.nextLine().split(",");
                for (String surname : surnames) {
                    uniqueSurnames.add(surname.trim());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return uniqueSurnames;
    }
}
