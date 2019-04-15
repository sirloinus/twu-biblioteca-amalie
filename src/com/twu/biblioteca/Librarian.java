package com.twu.biblioteca;

import java.util.Scanner;

public class Librarian {

    Scanner scanner = new Scanner(System.in);
    private BookList bookList;

    public Librarian(BookList bookList) {
        this.bookList = bookList;
    }

    public void checkOutBook(User user) {
        // add book to user list of books

        // change checked out status of book to true
        Book book = this.findBook();
        boolean outcome = book.checkOutBook();
        String message = outcome ? "Thank you! Enjoy the book." : "Book already checked out of library.";
        System.out.println(message);    }

    public void returnBook(User user) {
        // remove book from user's books

        // change checked out status of book to false
        Book book = this.findBook();
        boolean outcome = book.returnBook();
        String message = !outcome ? "Successfully returned to library" : "Cannot return as book already in the library.";
        System.out.println(message);
    }


    private String getBookTitle() {
        System.out.println("Please enter title of book.");
        String title = scanner.nextLine();
        return title;
    }

    private Book findBook() {
        String bookTitle = this.getBookTitle();
        Book foundBook = bookList.bookCollection.get(bookTitle);
        return foundBook;
    }
}
