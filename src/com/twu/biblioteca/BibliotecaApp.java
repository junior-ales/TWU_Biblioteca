package com.twu.biblioteca;

public class BibliotecaApp {

    private Presenter presenter;

    public BibliotecaApp(Presenter presenter) {
        this.presenter = presenter;
    }

    public void init() {
        presenter.printWelcomeMessage();
    }

    public static void main(String[] args) {
        new BibliotecaApp(new Presenter(System.out)).init();
    }
}
