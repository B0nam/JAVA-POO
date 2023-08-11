package domain;

import java.time.LocalDate;

public class Estagiario extends Pessoa implements Cargo
{

    public Estagiario(String nome, int idade, LocalDate dataNascimento)
    {
        super(nome, idade, dataNascimento);
    }

    @Override
    public double valorSalario(Movimentacao movimentacao) {
        return 100.00;
    }
}
