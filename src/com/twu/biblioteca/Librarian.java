package com.twu.biblioteca;

import java.util.Scanner;

public class Librarian {

    Scanner scanner = new Scanner(System.in);
    private BookList bookList;

    public Librarian(BookList bookList) {
        this.bookList = bookList;
    }

    public void checkOutItem(User user) {
        // add book to user list of books

        Book book = this.findBook();
        if(book != null) {
            boolean outcome = book.checkOutBook();
            checkoutMessage(outcome);
        } else {
            System.out.println("Cannot checkout book as it does not exist.");
        }
    }

    public void returnItem(User user) {
        // remove book from user's books

        Book book = this.findBook();
        if(book != null){
            boolean outcome = book.returnBook();
            returnMessage(outcome);
        } else {
            System.out.println("Cannot return as book does not exist.");
            returnItem(user);
        }
    }

    private void returnMessage(boolean bool) {
        String message = !bool ? "Successfully returned to library" : "Cannot return as book already in the library.";
        System.out.println(message);
    }

    private void checkoutMessage(boolean bool) {
        String message = bool ? "Thank you! Enjoy the book." : "Book already checked out of library.";
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
