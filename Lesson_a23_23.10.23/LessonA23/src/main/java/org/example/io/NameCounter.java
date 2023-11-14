package org.example.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NameCounter {

    public long countTotalNames(String fileName) {
        long totalNames = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {

                String[] names = line.split(" ");
                totalNames += names.length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return totalNames;
    }

    public static void main(String[] args) {
        NameCounter nameCounter = new NameCounter();
        String fileName = "C:\\Users\\Tel-ran.de\\Desktop\\IT Tel Ran\\Java\\Lesson_a23_23.10.23\\LessonA23\\src\\main\\java\\org\\example\\names.txt";
        long totalNames = nameCounter.countTotalNames(fileName);
        System.out.println("Общее число имен в файле: " + totalNames);
    }
}

