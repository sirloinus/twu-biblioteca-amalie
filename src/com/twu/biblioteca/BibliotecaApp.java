package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp biblioteca = new BibliotecaApp();
        Menu menu = new Menu();
        biblioteca.welcome();
        menu.displayMenu();
    }

    public static String welcome() {
        String welcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        System.out.println(welcomeMessage);
        return welcomeMessage;
    }
}
