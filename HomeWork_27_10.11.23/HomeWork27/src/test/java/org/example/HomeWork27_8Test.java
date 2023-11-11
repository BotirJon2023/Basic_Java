package org.example;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeWork27_8Test {

    @Test
    void main() {
    }


    @Test
    public void testReadNamesFromFile() {
        // Arrange
        String testFilePath = "C:\\Users\\Tel-ran.de\\Desktop\\IT Tel Ran\\Java\\HomeWork_27_10.11.23\\HomeWork27\\src\\main\\java\\org\\example\\1.txt";
        HomeWork27_8 yourClassInstance = new HomeWork27_8(); // Replace YourClassName with the actual class name
        List<String> expectedNames = Arrays.asList("Alice", "Bob", "Eve");
        // Create a test file with the above names or mock the behavior

        // Act
        List<String> names = yourClassInstance.readNamesFromFile(testFilePath);

        // Assert
        assertEquals(expectedNames, names);
    }

    @Test
    public void testCalculateAverageNameLength() {
        // Arrange
        List<String> names = Arrays.asList("Alice", "Bob", "Eve");
        HomeWork27_8 yourClassInstance = new HomeWork27_8();
        double expectedAverageLength = 4.0; // (5 + 3 + 3) / 3 = 11 / 3 = 3.6667

        // Act
        double averageLength = yourClassInstance.calculateAverageNameLength(names);

        // Assert
        assertEquals(expectedAverageLength, averageLength, 0.0001); // Allow for a small epsilon for double comparison
    }
}