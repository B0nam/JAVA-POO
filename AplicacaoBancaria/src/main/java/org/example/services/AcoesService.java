package org.example.services;

import org.example.domain.ContaBancaria;
import org.example.domain.enums.TipoOperacao;

public class AcoesService
{
    public void Deposito(ContaBancaria contaBancaria, Double dValor)
    {
        contaBancaria.setdValorEmConta(contaBancaria.getdValorEmConta() + dValor);
        contaBancaria.addOperacao(dValor, TipoOperacao.DEPOSITO);
    }

    public void Pagamento(ContaBancaria contaBancaria, Double dValor)
    {
        contaBancaria.setdValorEmConta(contaBancaria.getdValorEmConta() - dValor);
        contaBancaria.addOperacao(dValor, TipoOperacao.PAGAMENTO);
    }

    public void Financiamento(ContaBancaria contaBancaria, Double dValor, Integer iNumeroDeParcelas)
    {
        contaBancaria.setdValorEmConta(contaBancaria.getdValorEmConta() + dValor);
        for (int x = 0; x < iNumeroDeParcelas; x++)
        {
            contaBancaria.addParcela(dValor / iNumeroDeParcelas);
        }
    }

    public void PagamentoDoFinanciamento(ContaBancaria contaBancaria, Double dValor, Integer iNumeroDeParcelas)
    {
        contaBancaria.setdValorEmConta(contaBancaria.getdValorEmConta() - dValor);
        for (int x = 0; x < iNumeroDeParcelas; x++)
        {
            contaBancaria.rmParcela();
        }
    }

    public void Aplicacao(ContaBancaria contaBancaria, Double dValor, Double dValorRetorno)
    {
        contaBancaria.addOperacao(dValor, TipoOperacao.APLICACAO);
        this.Pagamento(contaBancaria, dValor);
        this.Deposito(contaBancaria, dValor * dValorRetorno);
    }
}
