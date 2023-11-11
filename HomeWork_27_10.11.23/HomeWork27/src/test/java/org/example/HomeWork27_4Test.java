package org.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class HomeWork27_4Test {

    @Test
    public void testGroupNamesByLength() {
        // Arrange
        String testFilePath = "C:\\Users\\Tel-ran.de\\Desktop\\IT Tel Ran\\Java\\HomeWork_27_10.11.23\\HomeWork27\\src\\main\\java\\org\\example\\1.txt";
        HomeWork27_4 yourClassInstance = new HomeWork27_4(); // Replace YourClassName with the actual class name

        // Act
        Map<Integer, List<String>> groupedNames = yourClassInstance.groupNamesByLength(testFilePath);

        // Assert
        assertEquals(Arrays.asList("John", "Anna"), groupedNames.get(4));
        assertEquals(Arrays.asList("Bob", "Eva"), groupedNames.get(3));
        assertEquals(Arrays.asList("Alice"), groupedNames.get(5));
        // Add more assertions based on your test file content

        // Additional assertions for exception handling
        yourClassInstance.groupNamesByLength("nonexistentfile.txt");
    }
}