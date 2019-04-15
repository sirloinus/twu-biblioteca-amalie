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

//    public void changeCheckedOutStatus() {
//        this.checkedOut = this.checkedOut ? false : true;
//    }

    public boolean checkOutBook() {
        if(this.checkedOut == false){
            this.checkedOut = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean returnBook() {
        if(this.checkedOut == true) {
            this.checkedOut = false;
            return false;
        } else {
            return true;
        }
    }
}
