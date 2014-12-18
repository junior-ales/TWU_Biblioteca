package com.twu.biblioteca;


import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaAppTest {

    @Test
    public void shouldPrintAWelcomeMessage() {
        Presenter presenter = mock(Presenter.class);
        BibliotecaApp biblioteca = new BibliotecaApp(presenter);

        biblioteca.init();

        verify(presenter).printWelcomeMessage();
    }
}
