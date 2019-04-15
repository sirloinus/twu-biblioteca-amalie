package com.twu.biblioteca;

public class Book {

    private String title;
    private String author;
    private String year;
    private boolean checkedOut;

    public Book(String title, String author, String year ) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.checkedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getYear() {
        return year;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public String getBookInfo() {

        return this.title + " | " + this.author + " | " + this.year + " | " + this.checkedOut + "\n";
    }

    public void checkOutBook() {
        this.checkedOut = true;
    }

    public void returnBook() {
        this.checkedOut = false;
    }
}
