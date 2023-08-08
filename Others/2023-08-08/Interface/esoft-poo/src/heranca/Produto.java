package heranca;

import interfacejava.ProdutoInterface;

public abstract class Produto implements ProdutoInterface {
    private String nome;
    private double valor;

    public Produto(String nome, double valor)
    {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome()
    {
        return nome;
    }

    public double getValor()
    {
        return valor;
    }

    public abstract double calcularDesconto();
}
