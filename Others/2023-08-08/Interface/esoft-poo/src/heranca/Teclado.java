package heranca;

public class Teclado extends Produto
{
    public Teclado(String nome, double valor)
    {
        super(nome, valor);
    }

    @Override
    public double calcularDesconto() {
        return 0;
    }
}
