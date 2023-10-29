package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LibraryManager {
    private List<Book> libraryCatalog;
    private List<LibraryUser> libraryUsers;

    public LibraryManager() {
        libraryCatalog = new ArrayList<>();
        libraryUsers = new ArrayList<>();
    }

    public List<Book> getLibraryCatalog() {
        return libraryCatalog;
    }

    public void setLibraryCatalog(List<Book> libraryCatalog) {
        this.libraryCatalog = libraryCatalog;
    }

    public List<LibraryUser> getLibraryUsers() {
        return libraryUsers;
    }

    public void setLibraryUsers(List<LibraryUser> libraryUsers) {
        this.libraryUsers = libraryUsers;
    }

    public List<Book> listAvailableBooksByGenre(String genre) {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : libraryCatalog) {
            if (book.getGenre().equalsIgnoreCase(genre) && !book.isBorrowed()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    public Set<String> listUserEmailsWithReservedBooks() {
        Set<String> userEmails = new HashSet<>();
        for (LibraryUser user : libraryUsers) {
            List<Book> reservedBooks = user.getReservedBooks();
            if (!reservedBooks.isEmpty()) {
                userEmails.add(user.getEmail());
            }
        }
        return userEmails;
    }

    public void addBookToLibrary(Book book) {
        libraryCatalog.add(book);
    }

    public void removeBookFromLibrary(Book book) {
        libraryCatalog.remove(book);
    }

    public void borrowBook(LibraryUser user, Book book) {
        if (libraryCatalog.contains(book) && !book.isBorrowed()) {
            user.getUserBooksBorrowed(book);
            book.setBorrowed(true);
        }
    }

    public void reserveBook(LibraryUser user, Book book) {
        if (libraryCatalog.contains(book) && !book.isBorrowed()) {
            user.getUserBooksBorrowed(book);
        }
    }
}


