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
        String bookTitle = this.getBookTitle();
        Book book = this.findBook(bookTitle);
        book.checkOutBook();
        // System.out.println("******" + book.getTitle() + book.isCheckedOut());
    }

    public void returnBook(User user) {
        // remove book from user's books

        // change checked out status of book to false
        // book.returnBook();
    }

    private String getBookTitle() {
        System.out.println("Please enter title of book you would like to checkout.");
        String title = scanner.nextLine();
        return title;
    }

    private Book findBook(String bookTitle) {
        Book foundBook = bookList.bookCollection.get(bookTitle);
        return foundBook;
    }
}
