package domain;

public class Movimentacao
{
    private int quantidadeFalta;
    private int quantidadeAfastamento;
    private int quantidadeFerias;

    public Movimentacao(int qunatidadeFalta, int quantidadeAfastamento, int quantidadeFerias)
    {
        this.quantidadeFalta = qunatidadeFalta;
        this.quantidadeFerias = quantidadeFerias;
        this.quantidadeAfastamento = quantidadeAfastamento;
    }

    public int getQuantidadeAfastamento() {
        return quantidadeAfastamento;
    }

    public int getQuantidadeFalta() {
        return quantidadeFalta;
    }

    public int getQuantidadeFerias() {
        return quantidadeFerias;
    }
}
