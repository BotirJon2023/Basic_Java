package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


class AuthorTest {


    @Test
    public void testValidConstructor() {
        String validName = "John Doe";
        int validBirthYear = 1980;

        Author author = new Author(validName, validBirthYear);

        assertNotNull(author);
        assertEquals(validName, author.getName());
        assertEquals(validBirthYear, author.getBirthYear());
    }

    @Test
    public void testNullNameConstructor() {
        String nullName = null;
        int validBirthYear = 1980;

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Author(nullName, validBirthYear);
        });

        String expectedMessage = "Name cannot be null";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }


    @Test
    void getName() {
    }

    @Test
    void getBirthYear() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void testHashCode() {
    }
}