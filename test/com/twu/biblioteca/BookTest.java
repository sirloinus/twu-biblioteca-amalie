package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

public class BookTest {

    @Mock
    private Book book = new Book("Harry Potter and the Prisoner of Azkaban", "JK Rowling", "1999");

    @Test
    public void hasCorrectAttributes() {
        Assert.assertSame(book.getTitle(), "Harry Potter and the Prisoner of Azkaban");
        Assert.assertSame(book.getAuthor(), "JK Rowling");
        Assert.assertSame(book.getYear(), "1999");
    }

    @Test
    public void returnsCorrectBookInfoAsString() {
        String bookInfo = "Harry Potter and the Prisoner of Azkaban | JK Rowling | 1999\n";
        Assert.assertEquals(bookInfo, book.toString());
    }
}
