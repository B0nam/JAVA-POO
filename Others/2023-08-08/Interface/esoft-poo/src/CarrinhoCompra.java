import interfacejava.ProdutoInterface;

import java.util.List;

public class CarrinhoCompra
{
    public CarrinhoCompra()
    {
    }

    public double CalcularValorTotal(List<ProdutoInterface> produtos)
    {
        double valorTotal = 0d;

        for (ProdutoInterface p : produtos)
        {
            valorTotal += p.getValor() - p.calcularDesconto();
        }

        return valorTotal;
    }
}
