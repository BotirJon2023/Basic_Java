package org.example;

import java.util.List;
import java.util.Set;


public class LibraryUser {
    private int userId;
    private String userName;
    private String userEmail;
    private String userPhone;
    private List<String> userBooksBorrowed; // Список книг, взятых пользователем в аренду.
    private Set<String> userBooksReserved; // Множество книг, зарезервированных пользователем.

    public LibraryUser(int userId, String userName, String userEmail, String userPhone) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
    }

     // Геттеры и сеттеры для полей класса
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public List<String> getUserBooksBorrowed(Book book) {
        return userBooksBorrowed;
    }

    public void setUserBooksBorrowed(List<String> userBooksBorrowed) {
        this.userBooksBorrowed = userBooksBorrowed;
    }

    public Set<String> getUserBooksReserved() {
        return userBooksReserved;
    }

    public void setUserBooksReserved(Set<String> userBooksReserved) {
        this.userBooksReserved = userBooksReserved;
    }

    public List<Book> getReservedBooks() {
        return null;
    }

    public String getEmail() {
        return userEmail;
    }

    public void setEmail(String email) {
        this.userEmail = email;
    }
}