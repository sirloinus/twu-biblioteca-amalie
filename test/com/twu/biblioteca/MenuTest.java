package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

public class MenuTest {

    Menu menu = new Menu();
    // CREATE MOCK BOOKLIST BookList BookList = { displayBooks: () => {} };
    // BookList bookList = mock(BookList.class);

    @Test
    public void displayMenu() {
        String menuOptions = "1. View list of books \n" +
                "2. Checkout a book \n" +
                "3. Return a book \n" +
                "4. View list of movies \n" +
                "5. Checkout a movie \n" +
                "6. Return a movie \n" +
                "7. Quit Biblioteca \n";
        String actual = menu.displayMenu();
        Assert.assertEquals(menuOptions, actual);
    }

    @Test
    public void displayErrorMessageIfInputInvalid() {
        String errorMessage = "Please select a valid option!";
        Assert.assertEquals(errorMessage, menu.selectOption(9));
        Assert.assertEquals(errorMessage, menu.selectOption(-3));
    }


    @Test
    public void callsBookListDisplayBooksGivenCorrectInput() {
        String message = "Displaying books...";
        Assert.assertEquals(message, menu.selectOption(1));
        // TODO: mock booklist so that can check if getBooks was called
        // Assert.assertThat(verify(bookList).getBooks());
    }

    @Test
    public void quitProgrammeWhenOptionSelected() {
        String message = "Quiting Biblioteca";
        Assert.assertEquals(message, menu.selectOption(7));
        // TODO: test that System.exit(0) was called.
    }
}
