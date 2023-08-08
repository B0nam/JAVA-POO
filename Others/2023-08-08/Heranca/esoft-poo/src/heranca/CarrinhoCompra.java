package heranca;

import java.util.List;

public class CarrinhoCompra
{
    public CarrinhoCompra()
    {
    }

    public double CalcularValorTotal(List<Produto> produtos)
    {
        double valorTotal = 0d;

        for (Produto p : produtos)
        {
            valorTotal += p.getValor() - p.calcularDesconto();
        }

        return valorTotal;
    }
}
