package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

public class LibrarianTest {

    @Mock private BookList bookList = new BookList();
    @Mock private Book testBook = new Book("Test", "Me", "2019");
    @Mock private Librarian librarian = new Librarian(bookList);
    @Mock private User user = new User();

    @Test
    public void canCheckoutBook() {

    }

    @Test
    public void canReturnBook() {

    }


    // PRIVATE METHODS
//    @Test
//    public void canRetrieveBookTitleFromUser() {
//        String bookTitle = "Test Book Title";
////        Assert.assertEquals();
//    }
//
//    @Test
//    public void canFindBookObject() {
//        bookList.addBook(testBook);
//        Book foundBook = librarian.findBook()
//    }

}