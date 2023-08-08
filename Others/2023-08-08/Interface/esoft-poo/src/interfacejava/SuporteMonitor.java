package interfacejava;

public class SuporteMonitor implements ProdutoInterface
{
    private String nome;
    private double valor;

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public double calcularDesconto() {
        return 0;
    }
}
