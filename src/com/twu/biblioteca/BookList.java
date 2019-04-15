package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;

public class BookList {

    public ArrayList<Book> bookList = new ArrayList<Book>();
    public HashMap<String, Book> bookCollection;

    public BookList() {
        this.bookCollection = new HashMap<String, Book>();
    }

    public Book getBook(String bookName) {
        return this.bookCollection.get(bookName);
    }


    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void addBook(Book book){
        if(this.bookCollection.containsKey(book.getTitle())) {
            System.out.println("Already in Biblioteca library!");
        } else {
            this.bookCollection.put(book.getTitle(), book);
            this.bookList.add(book);
        }
    }

    public void removeBook(String bookTitle) {
        if(this.bookCollection.containsKey(bookTitle)) {
            this.bookCollection.remove(bookTitle);
        } else {
            System.out.println("Book not found in Biblioteca library.");
        }
    }

    public void displayBooksInfo() {
        System.out.println("Book Title | Author | Publication Year | Checked Out\n");
        for(Book book: bookList){
            System.out.println(book.getBookInfo());
        }
    }



}
