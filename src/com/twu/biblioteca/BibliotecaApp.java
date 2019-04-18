package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        BookList bookList = createBookList();
        User user1 = new User();
        Librarian librarian = new Librarian(bookList);
        Menu menu = new Menu(bookList, librarian, user1);
        welcome();
        menu.start();
    }

    private static BookList createBookList() {
        Book hp = new Book("Harry Potter and the Prisoner of Azkaban", "JK Rowling", "1999");
        Book lotr = new Book("The Lord of the Rings", "JRR Tolkien", "1954");
        Book sum = new Book("Sum", "David Eagleman", "2009");
        BookList bookList = new BookList();
        bookList.addBook(hp);
        bookList.addBook(lotr);
        bookList.addBook(sum);
        return bookList;
    }

    private static String welcome() {
        String welcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        System.out.println(welcomeMessage);
        System.out.println(" ");
        return welcomeMessage;
    }

}
