package org.example.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class uniqueNames {

    public Set<String> uniqueNames(String fileName) {
        Set<String> uniqueNames = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("names.txt")) {
            String line;
        while((line = reader.readLine())!=null)

            {
                String[] names = line.split(" ");

                for (String name : names) {
                    // Удаляем начальные и конечные пробелы и добавляем имя в множество уникальных имен
                    uniqueNames.add(name.trim());
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return uniqueNames;
    }
}