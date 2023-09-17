package org.exemple.domain;

import org.example.domain.ContaPessoa;
import org.example.domain.enums.TipoConta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaPessoaTest
{
    @Test
    public void DeveVerificarDocumentacao()
    {
        ContaPessoa contaPessoa = new ContaPessoa(1, TipoConta.CORRENTE, 0.0, "Joselito", "111.111.111-11");
        contaPessoa.VerificarDocumentacao("Joselito", "111.111.111-11");
        Assertions.assertNotNull(contaPessoa);
    }

    @Test
    void DeveGerarExceptionQuandoNomeForInvalido()
    {
        ContaPessoa contaPessoa = new ContaPessoa(1, TipoConta.CORRENTE, 0.0, "Joselito", "111.111.111-11");

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
        {
            contaPessoa.VerificarDocumentacao("Josue", "111.111.111-11");
        });
        Assertions.assertEquals("Os documentos fornecidos são diferentes dos registrados.", exception.getMessage());
    }

    @Test
    void DeveGerarExceptionQuandoCpfForInvalido()
    {
        ContaPessoa contaPessoa = new ContaPessoa(1, TipoConta.CORRENTE, 0.0, "Joselito", "111.111.111-11");

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
        {
            contaPessoa.VerificarDocumentacao("Joselito", "222.222.222-22");
        });
        Assertions.assertEquals("Os documentos fornecidos são diferentes dos registrados.", exception.getMessage());
    }
}
