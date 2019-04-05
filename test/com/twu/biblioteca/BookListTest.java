package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

public class BookListTest {

    @Mock private Book hp = new Book("Harry Potter and the Prisoner of Azkaban", "JK Rowling", "1999");
    @Mock private Book lotr = new Book("The Lord of the Rings", "JRR Tolkien", "1954");
    @Mock private Book sum = new Book("Sum", "David Eagleman", "2009");
    @Mock private BookList bookList = new BookList();

    @Test
    public void addBookToBookList() {
        bookList.addBook(hp);
        bookList.addBook(lotr);
        int size = bookList.getBookList().size();
        Assert.assertSame(2, size);
    }
}
