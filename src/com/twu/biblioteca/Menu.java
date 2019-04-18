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

    void start() {
        displayMenu();
        getUserInput();
    }

    String displayMenu() {
        String options = "1. View list of all books \n" +
                "2. Checkout a book \n" +
                "3. Return a book \n" +
                "4. View list of movies \n" +
                "5. Checkout a movie \n" +
                "6. Return a movie \n" +
                "7. Quit Biblioteca \n";
        System.out.println(options);
        return options;
    }


    private void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a menu option");
        String choice = scanner.nextLine();
        try {
            selectOption(Integer.parseInt(choice));
        } catch(Exception e) {
            System.out.println("Invalid, try again");
            getUserInput();
        }
    }

    private void quitApplication() {
        System.exit(0);
    }

    String selectOption(int option) {
        String message = " ";
        switch(option) {
            case 1:
                message = "Displaying books...";
                bookList.displayBooksInfo();
                break;
            case 2:
                librarian.checkOutItem(user);
                break;
            case 3:
                librarian.returnItem(user);
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
                System.out.println("Quiting Biblioteca");
                quitApplication();
                break;
            default:
                System.out.println("Please select a valid option!");
        }
        System.out.println(" ");
        displayMenu();
        getUserInput();
        return message;
    }

}
