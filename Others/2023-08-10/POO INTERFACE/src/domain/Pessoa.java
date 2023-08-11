package domain;

import java.time.LocalDate;

public abstract class Pessoa
{
    private String nome;
    private int idade;
    private LocalDate dataNascimento;

    public String getNome() {
        return nome;
    }

    public Pessoa(String nome, int idade, LocalDate dataNascimento)
    {
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
    }
}
