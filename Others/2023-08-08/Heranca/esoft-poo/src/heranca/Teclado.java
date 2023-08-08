package heranca;

public class Teclado extends Produto
{
    public Teclado(String nome, double valor)
    {
        super(nome, valor);
    }

    @Override
    double calcularDesconto() {
        return 0;
    }
}
