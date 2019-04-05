package com.twu.biblioteca;

public class Menu {

    private BookList bookList = new BookList();

    public String displayMenu() {
        String options = "1. View list of books \n" +
                "2. Checkout a book \n" +
                "3. Return a book \n" +
                "4. View list of movies \n" +
                "5. Checkout a movie \n" +
                "6. Return a movie \n" +
                "7. Quit Biblioteca \n";;
        System.out.println(options);
        return options;
    }

    public String selectOption(int option) {
        String message = "";
        switch(option) {
            case 1:
                message = "Displaying books...";
//                for(Book book: bookList.getBooks()){
//                    System.out.println(book.title + " | " + book.author + " | " + book.date);
//                }
                break;
            case 2:
                // BookList.checkoutBook();
                message = "Checking out book....";
                break;
            case 3:
                message = "Returning book..";
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
                // System.exit(0);
                break;
            default:
                message = "Please select a valid option!";
        }
        System.out.println(message);
        return message;
    }

}
