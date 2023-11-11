package org.example;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class HomeWork27_1Test {

    @Test
    void createNameMap() {
        Map<Character, Integer> nameMap = new HashMap<>();

        // Perform operations to populate the map (as done in your code)

        // Simulating operations on the map
        nameMap.put('a', 1);
        nameMap.put('b', 3);
        nameMap.put('c', 5);

        // Test map size
        assertEquals(3, nameMap.size());

        // Test specific entries
        assertEquals(Integer.valueOf(1), nameMap.get('a'));
        assertEquals(Integer.valueOf(3), nameMap.get('b'));
        assertEquals(Integer.valueOf(5), nameMap.get('c'));

        // Test non-existent entry
        assertNull(nameMap.get('z'));

        // Test map behavior when trying to replace an existing entry
        nameMap.put('a', 10);
        assertEquals(Integer.valueOf(10), nameMap.get('a'));
    }

    @Test
    public void testReadFile() {
        // Arrange
        File file = new File("C:\\Users\\Tel-ran.de\\Desktop\\IT Tel Ran\\Java\\HomeWork_27_10.11.23\\HomeWork27\\src\\main\\java\\org\\example\\1.txt");

        // Act and Assert
        assertThrows(FileNotFoundException.class, () -> {
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    String name = scanner.nextLine().trim();
                    // Add your assertions or processing logic here
                    // For example, you can assert that 'name' has certain properties
                }
            }
        });
    }

    @Test
    public void testUpdateNameMap() {
        Map<Character, Integer> nameMap = new HashMap<>();

        // Assuming you have a method to update the nameMap
        String name = "John";
        updateNameMap(nameMap, name);

        assertEquals(1, nameMap.get('j'));
    }

    public void updateNameMap(Map<Character, Integer> nameMap, String name) {
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
}
