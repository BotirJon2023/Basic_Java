package org.example;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;
class HomeWork27_9Test {

    @Test
    void TestCreatePhoneBook() {
        HomeWork27_9 HomeWork27_9 = new HomeWork27_9();
        Map<String, String> phoneBook = HomeWork27_9.createPhoneBook(); // Replace YourClassName with the actual class name
        assertNotNull(phoneBook);
        assertTrue(phoneBook.containsKey("Phone number 1"));
        assertEquals("John Doe", phoneBook.get("Phone number 1"));
        assertTrue(phoneBook.containsKey("Phone number 2"));
        assertEquals("Jane Doe", phoneBook.get("Phone number 2"));
    }
}
