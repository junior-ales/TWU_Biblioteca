package com.twu.biblioteca;

import java.io.PrintStream;

public class Presenter {
    private PrintStream printStream;

    public Presenter(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void printWelcomeMessage() {
        printStream.print("Welcome to Biblioteca, the TWU Library");
    }
}
