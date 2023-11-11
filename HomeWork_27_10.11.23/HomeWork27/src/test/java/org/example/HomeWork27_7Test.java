package org.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;

class HomeWork27_7Test {

    @Test
    public void testConvertData() {
        // Arrange
        String testFilePath = "path/to/your/test/file.txt";
        String outputFilePath = "converted_data.txt";
        HomeWork27_7 yourClassInstance = new HomeWork27_7(); // Replace YourClassName with the actual class name

        // Act
        assertThrows(IOException.class, () -> {
            yourClassInstance.convertData();
        });
    }
}
