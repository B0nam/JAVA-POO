package org.example.service;

import org.example.domain.Motorista;

public class CalculadoraSeguro {

    public Double calcular(Motorista motorista) {

        Double valorFipe = motorista.getAutomovel()
                .getValorBase();

        Double pcTipoAutomovel = motorista.getAutomovel()
                .getTipoAutomovel().getPercentual();

        Double pcEstadoCivil = motorista.getEstadoCivil()
                .getPercentual();




        double primeiroValor = valorFipe * pcTipoAutomovel;

        double segundoValor = (valorFipe * pcEstadoCivil) - valorFipe;

        double valorTotalSeguro = primeiroValor + segundoValor;

        if (motorista.getEstacionamento() != null) {
            return valorTotalSeguro - motorista
                    .getEstacionamento()
                    .valorDesconto(valorTotalSeguro);
        }


        return valorTotalSeguro;
    }

}
