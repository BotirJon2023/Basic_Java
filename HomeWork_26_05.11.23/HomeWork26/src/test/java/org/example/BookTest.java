package org.example;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

class BookTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNullTitle() {
        Author author = null;
        Book book = new Book(null, author, "1234567890", 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNullAuthor() {
        Book book = new Book("Book Title", null, "1234567890", 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNullIsbn() {
        Author author = null;
        Book book = new Book("Book Title", author, null, 10);
    }

    @Test
    public void testConstructorWithValidInputs() {
        Author author = null;
        Book book = new Book("Book Title", author, "1234567890", 10);

        assertNotNull(book);
        assertEquals("Book Title", book.getTitle());
        assertEquals(author, book.getAuthor());
        assertEquals("1234567890", book.getIsbn());
        assertEquals(10, book.getCopies());
    }


    @Test(expected = IllegalArgumentException.class)
    public void testSetCopiesWithNegativeValue() {
        int copies = -1;

        Book.setCopies(copies);

        Assert.fail("Expected IllegalArgumentException to be thrown");
    }

    @Test
    public void testSetCopiesWithZeroValue() {
        int copies = 0;

        Book.setCopies(copies);

        Assert.assertEquals(copies, Book.getCopies());
    }

    @Test
    public void testSetCopiesWithPositiveValue() {
        int copies = 10;

        Book.setCopies(copies);

        Assert.assertEquals(copies, Book.getCopies());
    }


    @Test
    void getTitle() {
    }

    @Test
    void getAuthor() {
    }

    @Test
    void getIsbn() {
    }

    @Test
    void getCopies() {
    }

    @Test
    void setCopies() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void testHashCode() {
    }
}