package com.twu.biblioteca;


import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class BibliotecaAppTest {

    BibliotecaApp biblioteca = new BibliotecaApp();

    @Test
    public void BibliotecaShowsWelcomeMessage() {
        String welcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        String actual = biblioteca.welcome();
        Assert.assertThat(actual, CoreMatchers.is(welcomeMessage));
    }

}
