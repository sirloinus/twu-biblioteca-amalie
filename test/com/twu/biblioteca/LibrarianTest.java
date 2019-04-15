package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.mock;

public class LibrarianTest {

    private Book testBook;
    @Mock private BookList bookList = new BookList();
    @Mock private Librarian librarian = new Librarian(bookList);
    @Mock private User user = new User();

    @Test
    public void checkoutBookIsTrueWhenBookIsCheckedOut() {
        testBook = mock(Book.class);

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