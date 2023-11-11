package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class HomeWork27_10Test {

    @Test
    public void testReadContactsFromFile() {
        String fileName = "path/to/your/test/file.txt"; // Provide a test file path
        String[] contacts = HomeWork27_10.readContactsFromFile(fileName);

        // Assuming the test file has specific contents
        assertEquals(3, contacts.length);
        assertEquals("John", contacts[0]);
        assertEquals("Jane", contacts[1]);
        assertEquals("Bob", contacts[2]);

        // Test for a non-existent file
        assertNull(HomeWork27_10.readContactsFromFile("nonexistentfile.txt"));
    }

    @Test
    public void testFindMinLengthContact() {
        String[] contacts = {"John", "Jane", "Bob", "Alice"};

        // Test when there are contacts
        assertEquals("Bob", HomeWork27_10.findMinLengthContact(contacts));

        // Test when the contacts array is empty
        assertNull(HomeWork27_10.findMinLengthContact(new String[0]));
    }

    @Test
    public void testFindMaxLengthContact() {
        String[] contacts = {"John", "Jane", "Bob", "Alice"};

        // Test when there are contacts
        assertEquals("Jane", HomeWork27_10.findMaxLengthContact(contacts));

        // Test when the contacts array is empty
        assertNull(HomeWork27_10.findMaxLengthContact(new String[0]));
    }
}

