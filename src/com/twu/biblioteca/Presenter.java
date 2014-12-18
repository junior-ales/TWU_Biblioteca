package com.twu.biblioteca;

import java.io.PrintStream;

public class Presenter {
    private PrintStream printStream;

    public Presenter(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void print(String message) {
        printStream.print(message);
    }
}
