package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static final String WELCOME_MESSAGE = "Welcome to Biblioteca, the TWU Library";
    private Presenter presenter;
    private List<String> books;

    public BibliotecaApp(Presenter presenter) {
        this.presenter = presenter;

        books = new ArrayList<String>();
        books.add("book1");
        books.add("book2");
        books.add("book3");
    }

    public void init() {
        presenter.print(WELCOME_MESSAGE);
        presenter.print(listBooks(books));
    }

    public String listBooks(List<String> books) {
        return "List of books: " + books;
    }

    public static void main(String[] args) {
        new BibliotecaApp(new Presenter(System.out)).init();
    }
}
