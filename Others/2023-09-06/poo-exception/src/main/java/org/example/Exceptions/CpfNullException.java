package org.example.Exceptions;

public class CpfNullException extends Exception
{
    public CpfNullException()
    {
        super("CPF não pode ser Null.");
    }
}
