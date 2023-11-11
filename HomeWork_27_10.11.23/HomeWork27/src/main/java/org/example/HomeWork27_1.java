package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HomeWork27_1 {

    public static void main(String[] args) {
        Map<Character, Integer> nameMap = createNameMap();
        System.out.println(nameMap);
    }

    public static Map<Character, Integer> createNameMap() {
        Map<Character, Integer> nameMap = new HashMap<>();

        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\Tel-ran.de\\Desktop\\IT Tel Ran\\Java\\HomeWork_27_10.11.23\\HomeWork27\\src\\main\\java\\org\\example\\1.txt"));
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine().trim();

                if (!name.isEmpty()) {
                    char firstLetter = Character.toLowerCase(name.charAt(0));

                    if (nameMap.containsKey(firstLetter)) {
                        int count = nameMap.get(firstLetter);
                        nameMap.put(firstLetter, count + 1);
                    } else {
                        nameMap.put(firstLetter, 1);
                    }
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return nameMap;
    }
}

