package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class PresenterTest {

    @Test
    public void shouldPrintWelcomeMessage() throws Exception {
        ByteArrayOutputStream outSpy = new ByteArrayOutputStream();
        Presenter presenter = new Presenter(new PrintStream(outSpy));
        presenter.printWelcomeMessage();

        assertThat(outSpy.toString(), equalTo("Welcome to Biblioteca, the TWU Library"));
    }
}