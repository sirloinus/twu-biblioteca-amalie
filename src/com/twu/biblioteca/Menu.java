package com.twu.biblioteca;

import java.util.Scanner;

public class Menu {

    private BookList bookList;
    private Librarian librarian;
    private User user;

    public Menu(BookList bookList, Librarian librarian, User user) {
        this.bookList = bookList;
        this.librarian = librarian;
        this.user = user;
    }

    public void start() {
        displayMenu();
        getUserInput();
    }

    public String displayMenu() {
        String options = "1. View list of books \n" +
                "2. Checkout a book \n" +
                "3. Return a book \n" +
                "4. View list of movies \n" +
                "5. Checkout a movie \n" +
                "6. Return a movie \n" +
                "7. Quit Biblioteca \n";
        System.out.println(options);
        return options;
    }


    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option");
        String choice = scanner.nextLine();
        try {
            selectOption(Integer.parseInt(choice));
        } catch(Exception e) {
            System.out.println("Try again");
            getUserInput();
        }
    }

    public void quitApplication() {
        System.exit(0);
    }

    public String selectOption(int option) {
        String message = " ";
        switch(option) {
            case 1:
                message = "Displaying books...";
                bookList.displayBooksInfo();
                break;
            case 2:
                librarian.checkOutBook(user);
                break;
            case 3:
                librarian.returnBook(user);
                break;
            case 4:
                message = "Displaying movies...";
                break;
            case 5:
                message = "Checking out movie";
                break;
            case 6:
                message = "Returning movie";
                break;
            case 7:
                message = "Quiting Biblioteca";
                quitApplication();
                break;
            default:
                message = "Please select a valid option!";
        }
        System.out.println(message);
        System.out.println(" ");
        this.displayMenu();
        this.getUserInput();
        return message;
    }

}
