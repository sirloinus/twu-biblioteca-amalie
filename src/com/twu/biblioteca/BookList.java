package com.twu.biblioteca;

import java.util.ArrayList;

public class BookList {

    public ArrayList<Book> bookList = new ArrayList<Book>();

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void addBook(Book book){
        this.bookList.add(book);
    }

    public void displayBooksInfo() {
        for(Book book: bookList){
            System.out.println(book.getBookInfo());
        }
    }

}
