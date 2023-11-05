package org.example;

import jdk.internal.foreign.abi.Binding;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    private Binding.Allocate Mockito;

    @Test
    public void testAddBook() {
        Library library = new Library();
        List<Book> books = new ArrayList<>();
        List<String> authors = new ArrayList<>();

        // Create a mock book
        Book mockBook = Mockito.wait(Book.setCopies(2);


        library.addBook(mockBook);

        // Verify that the book is added to the books list
        Mockito.verify(books).add(mockBook);

        // Verify that the author is added to the authors list
        Mockito.verify(authors).add("John Doe");
    }

    @Test
    void addBook() {
    }

    @Test
    void removeBook() {
    }

    @Test
    void getBooksByAuthor() {
    }

    @Test
    void getAllAuthors() {
    }

    @Test
    void findBookByISBN() {
    }

    @Test
    void searchBooksByTitle() {
    }

    @Test
    void addCopies() {
    }

    @Test
    void lendBook() {
    }

    @Test
    void returnBook() {
    }
}