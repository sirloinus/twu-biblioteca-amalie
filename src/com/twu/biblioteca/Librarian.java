package com.twu.biblioteca;

public class Librarian {

    public void checkOutBook(User user, Book book) {
        // add book to user list of books

        // change checked out status of book to true
        book.checkOutBook();
    }

    public void returnBook(User user, Book book) {
        // remove book from user's books

        // change checked out status of book to false
        book.returnBook();
    }
}
