package org.example;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class HomeWork27_2Test {

    @SneakyThrows
    @Test
    public void testLetterCountMap() {
        String fileName = "C:\\Users\\Tel-ran.de\\Desktop\\IT Tel Ran\\Java\\HomeWork_27_10.11.23\\HomeWork27\\src\\main\\java\\org\\example\\1.txt";

        Map<Character, Integer> letterCountMap = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("1.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.isEmpty()) {
                    char firstLetter = line.charAt(0);
                    int count = letterCountMap.getOrDefault(firstLetter, 0);
                    letterCountMap.put(firstLetter, count + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(5, letterCountMap.get('A')); // Example assertion for letter 'A' count.
    }
    @Test
    public void testMostFrequentLetter() {
        // Create an instance of your class or the class containing the provided code
        HomeWork27_2 yourClass = new HomeWork27_2();

        // Create a sample letterCountMap for testing
        Map<Character, Integer> letterCountMap = new HashMap<>();
        letterCountMap.put('a', 3);
        letterCountMap.put('b', 5);
        letterCountMap.put('c', 2);

        // Set the letterCountMap in your class instance (assuming you have a setter method)
        yourClass.toString();

        // Call the method or code you want to test
        yourClass.toString();

        // Check the result
        assertEquals('b', yourClass.toString());
    }
}
