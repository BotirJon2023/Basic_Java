package Taski;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {



    private static final List<Author> list = new ArrayList<>();
    private static final Library lib = new Library();
    private static final Author AUTHOR = Mockito.mock(Author.class);
    private static final Set<Book> bookset = new HashSet<>();
    private static final Book BOOK = Mockito.mock(Book.class);

    private static final Book MOCK = Mockito.mock(Book.class);

    private Library library = new Library();


    @BeforeEach
    void setUp() {
        bookset.add(BOOK);
        list.add(AUTHOR);

    }


    @Test
    void addBookNullTest() {
        Book book = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> library.addBook(book);
    }

    @Test
    void addBookTest() {
        Book book = MOCK;
        System.out.println(ad.);
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