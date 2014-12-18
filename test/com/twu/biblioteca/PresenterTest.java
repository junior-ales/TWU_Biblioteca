package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class PresenterTest {

    @Test
    public void shouldPrintAMessage() throws Exception {
        ByteArrayOutputStream outSpy = new ByteArrayOutputStream();
        Presenter presenter = new Presenter(new PrintStream(outSpy));
        presenter.print("A message");

        assertThat(outSpy.toString(), equalTo("A message\n"));
    }
}