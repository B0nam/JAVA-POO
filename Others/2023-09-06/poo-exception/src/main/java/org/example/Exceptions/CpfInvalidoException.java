package org.example.Exceptions;

public class CpfInvalidoException extends Exception
{
    public CpfInvalidoException()
    {
        super("CPF não possui a quantidade necessaria de caracteres.");
    }
}
