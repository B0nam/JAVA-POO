package heranca;

public class Monitor extends Produto
{
    public Monitor(String nome, double valor)
    {
        super(nome, valor);
    }
    {

    }

    @Override
    public double calcularDesconto()
    {
        return (getValor() * (10.0 / 100.0));
    }
}