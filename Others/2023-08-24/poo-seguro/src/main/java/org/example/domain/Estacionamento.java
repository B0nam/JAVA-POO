package org.example.domain;

public class Estacionamento {

    private Boolean temPortaoAutomatico;

    public Estacionamento(Boolean temPortaoAutomatico) {
        this.temPortaoAutomatico = temPortaoAutomatico;
    }

    public Double valorDesconto(Double valorSeguro) {


        if (temPortaoAutomatico) {
            return valorSeguro * 0.045;
        }

        return valorSeguro * 0.02;
    }

}
