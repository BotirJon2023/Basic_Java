package org.example;


import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class HomeWork27_5Test {

    @Test
    public void TestFindUniqueSurnamesFromFile() {
        // Arrange
        String testFilePath = "path/to/your/test/file.txt";
        HomeWork27_5 yourClassInstance = new HomeWork27_5(); // Replace YourClassName with the actual class name

        // Act
        Set<String> uniqueSurnames = yourClassInstance.findUniqueSurnamesFromFile(testFilePath);

        // Assert
        assertEquals(3, uniqueSurnames.size()); // Replace 3 with the expected number of unique surnames
        assertTrue(uniqueSurnames.contains("Surname1"));
        assertTrue(uniqueSurnames.contains("Surname2"));
        assertTrue(uniqueSurnames.contains("Surname3"));
        // Add more assertions based on your test file content and expectations
    }


    @Test
    public void testFindUniqueSurnamesFromFile() {
        // Arrange
        String testFilePath = "path/to/your/test/file.txt";
        HomeWork27_5 yourClassInstance = new HomeWork27_5(); // Replace YourClassName with the actual class name

        // Act
        Set<String> uniqueSurnames = yourClassInstance.findUniqueSurnamesFromFile(testFilePath);

        // Assert
        assertEquals(3, uniqueSurnames.size()); // Replace 3 with the expected number of unique surnames
        assertTrue(uniqueSurnames.contains("Surname1"));
        assertTrue(uniqueSurnames.contains("Surname2"));
        assertTrue(uniqueSurnames.contains("Surname3"));
        // Add more assertions based on your test file content and expectations

        // Additional assertions for exception handling
        assertThrows(IOException.class, () -> {
            yourClassInstance.findUniqueSurnamesFromFile("nonexistentfile.txt");
        });
    }
}
