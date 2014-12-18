package com.twu.biblioteca;

public class BibliotecaApp {

    private Presenter presenter;
    public static final String WELCOME_MESSAGE = "Welcome to Biblioteca, the TWU Library";

    public BibliotecaApp(Presenter presenter) {
        this.presenter = presenter;
    }

    public void init() {
        presenter.print(WELCOME_MESSAGE);
    }

    public static void main(String[] args) {
        new BibliotecaApp(new Presenter(System.out)).init();
    }
}
