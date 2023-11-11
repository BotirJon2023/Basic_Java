package org.example;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HomeWork27_2 {

    public static void main(String[] args) {
        String fileName = "C:\\Users\\Tel-ran.de\\Desktop\\IT Tel Ran\\Java\\HomeWork_27_10.11.23\\HomeWork27\\src\\main\\java\\org\\example\\1.txt";  // Имя файла

        try {
            // Открытие файла и чтение его содержимого
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            Map<Character, Integer> letterCountMap = new HashMap<>();

            // Подсчет количества имён, начинающихся на каждую букву алфавита
            while ((line = reader.readLine()) != null) {
                if (!line.isEmpty()) {
                    char firstLetter = line.charAt(0);
                    int count = letterCountMap.getOrDefault(firstLetter, 0);
                    letterCountMap.put(firstLetter, count + 1);
                }
            }

            // Поиск самой часто встречающейся первой буквы
            char mostFrequentLetter = ' ';
            int maxCount = 0;

            for (Map.Entry<Character, Integer> entry : letterCountMap.entrySet()) {
                char letter = entry.getKey();
                int count = entry.getValue();

                if (count > maxCount) {
                    mostFrequentLetter = letter;
                    maxCount = count;
                }
            }

            reader.close();

            // Вывод результата
            System.out.println("Самая часто встречающаяся первая буква: " + mostFrequentLetter);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

}
