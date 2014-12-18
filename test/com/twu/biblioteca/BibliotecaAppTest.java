package com.twu.biblioteca;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyList;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaAppTest {

    @Test
    public void shouldPrintAWelcomeMessage() {
        Presenter presenter = mock(Presenter.class);
        BibliotecaApp biblioteca = new BibliotecaApp(presenter);

        biblioteca.init();

        verify(presenter).print(BibliotecaApp.WELCOME_MESSAGE);
    }

    @Test
    public void shouldListAllBooks() throws Exception {
        Presenter presenter = mock(Presenter.class);
        BibliotecaApp biblioteca = new BibliotecaApp(presenter);

        List<String> books = new ArrayList<String>();
        books.add("book1");
        books.add("book2");
        books.add("book3");

        assertThat(biblioteca.listBooks(books), equalTo("List of books: " + books.toString()));
    }
}
