package org.example.service;

import org.example.Exceptions.CpfInvalidoException;

public class FormatadorService
{
    public String formatarCpf(String cpf) throws CpfInvalidoException
    {
        String cpfFormatado = cpf.replaceAll("\\.|\\-", "");
        if (cpfFormatado.length() != 11)
        {
            throw new CpfInvalidoException();
        }

        return cpfFormatado;
    }
}
