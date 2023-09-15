package org.exemple.service;

import org.example.Exceptions.CpfNullException;
import org.example.service.FormatadorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FormatadorServiceTest
{
    @Test
    public void deveFormatarCpf()
    {
        FormatadorService service = new FormatadorService();

        String resultado = service.formatarCpf("123.123.456-77");

        Assertions.assertEquals("12312345677", resultado);
    }
}
