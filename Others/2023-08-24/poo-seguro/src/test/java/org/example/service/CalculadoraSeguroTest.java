package org.example.service;

import org.example.domain.Automovel;
import org.example.domain.Estacionamento;
import org.example.domain.Motorista;
import org.example.domain.enums.EstadoCivil;
import org.example.domain.enums.TipoAutomovel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraSeguroTest {

    @Test
    public void deveCalcularSolteiroSemEstacionamento() {

        Automovel automovel = new Automovel(
                TipoAutomovel.PASSEIO, 45000.0);

        Motorista manuel = new Motorista("Manuel",
                EstadoCivil.SOLTEIRO,
                automovel, null);


        CalculadoraSeguro calculadora = new CalculadoraSeguro();

        Double resultado = calculadora.calcular(manuel);

        Assertions.assertEquals( 9000.0 , resultado);


    }


    @Test
    public void deveCalcularSolteiroComPortaoManual() {

        //5400,00
        //3600,00
        // valor total seguro 9000,00
        // aplico desconto do portao 8820,00

        Automovel automovel = new Automovel(
                TipoAutomovel.PASSEIO, 45000.0);

        Estacionamento estacionamento = new Estacionamento(
                false);

        Motorista manuel = new Motorista("Manuel",
                EstadoCivil.SOLTEIRO,
                automovel, estacionamento);


        CalculadoraSeguro calculadora = new CalculadoraSeguro();

        Double resultado = calculadora.calcular(manuel);

        Assertions.assertEquals(8820.0, resultado);

    }

    @Test
    public void deveCalcularSolteiroComPortaoAutomatico()
    {
        //45.000,00
        Automovel automovel = new Automovel(TipoAutomovel.PASSEIO, 45000.00);
        Estacionamento estacionamento = new Estacionamento(true);
        Motorista manuel = new Motorista("Manuel", EstadoCivil.SOLTEIRO, automovel, estacionamento);
        CalculadoraSeguro calculadoraSeguro = new CalculadoraSeguro();

        Double resultado = calculadoraSeguro.calcular(manuel);

        Assertions.assertEquals(8595.0, resultado);
    }

    @Test
    public void deveCalcularCasadoComPortaoManual()
    {
        Automovel automovel = new Automovel(TipoAutomovel.PASSEIO, 32500.00);
        Estacionamento estacionamento = new Estacionamento(false);
        Motorista manuel = new Motorista("Manuel", EstadoCivil.CASADO, automovel, estacionamento);
        CalculadoraSeguro calculadoraSeguro = new CalculadoraSeguro();

        Double resultado = calculadoraSeguro.calcular(manuel);

        Assertions.assertEquals(3025.75, resultado);
    }

    @Test
    public void devCalcularCasadoPortaoAutomaticoTransporte()
    {
        Automovel onibus = new Automovel(TipoAutomovel.TRANSPORTE, 120500.0);
        Estacionamento estacionamento =  new Estacionamento(true);

        Motorista joao = new Motorista("Joao", EstadoCivil.CASADO, onibus, estacionamento);
        CalculadoraSeguro calculadoraSeguro = new CalculadoraSeguro();

        Double resultado = calculadoraSeguro.calcular(joao);

        Assertions.assertEquals(6329.2625,resultado);
    }
}
