package domain;

import java.time.LocalDate;

public class Funcionario extends Pessoa
{
    private int matricula;
    private Cargo cargo;
    private Movimentacao movimentacao;

    public Cargo getCargo() {
        return cargo;
    }

    public double getSalario()
    {
        return this.cargo.valorSalario(this.movimentacao);
    }

    public Movimentacao getMovimentacao() {
        return movimentacao;
    }

    public Funcionario(String nome, int idade, LocalDate dataNascimento, int matricula, Cargo cargo, Movimentacao movimentacao)
    {
        super(nome, idade, dataNascimento);
        this.matricula = matricula;
        this.cargo = cargo;
        this.movimentacao = movimentacao;
    }
}
