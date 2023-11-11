package org.example;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeWork27_6Test {

    @Test
    public void testReverseSortNames1() {
        // Arrange
        HomeWork27_6 NameProcessor = new HomeWork27_6();
        List<String> names = Arrays.asList("Alice", "Bob", "Eve");
        List<String> expectedSortedNames = Arrays.asList("Eve", "Bob", "Alice");

        // Act
        List<String> reverseSortedNames = NameProcessor.reverseSortNames(names);

        // Assert
        assertEquals(expectedSortedNames, reverseSortedNames);
    }

    @Test
    public void TestReadNamesFromFile() {
        // Arrange
        HomeWork27_6 NameProcessor = new HomeWork27_6();
        String testFilePath = "path/to/your/test/file.txt";
        List<String> expectedNames = Arrays.asList("Alice", "Bob", "Eve");
        // Mock the behavior of reading from a file or use an actual test file

        // Act
        List<String> names = NameProcessor.readNamesFromFile(testFilePath);

        // Assert
        assertEquals(expectedNames, names);
    }

    @Test
    public void testReadNamesFromFilE() {
        // Arrange
        HomeWork27_6 NameProcessor = new HomeWork27_6();
        String testFilePath = "C:\\Users\\Tel-ran.de\\Desktop\\IT Tel Ran\\Java\\HomeWork_27_10.11.23\\HomeWork27\\src\\main\\java\\org\\example\\1.txt";
        List<String> expectedNames = Arrays.asList("Alice", "Bob", "Eve");
        // Create a test file with the above names or mock the behavior

        // Act
        List<String> names = NameProcessor.readNamesFromFile(testFilePath);

        // Assert
        assertEquals(expectedNames, names);
    }

    @Test
    public void testReverseSortNames() {
        // Arrange
        HomeWork27_6 NameProcessor = new HomeWork27_6();
        List<String> inputNames = Arrays.asList("Alice", "Bob", "Eve");
        List<String> expectedSortedNames = Arrays.asList("Eve", "Bob", "Alice");

        // Act
        List<String> reverseSortedNames = NameProcessor.reverseSortNames(new ArrayList<>(inputNames));

        // Assert
        assertEquals(expectedSortedNames, reverseSortedNames);
    }
}



