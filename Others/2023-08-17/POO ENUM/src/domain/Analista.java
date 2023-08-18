package domain;

public class Analista implements Cargo
{
    @Override
    public double valorSalario(Movimentacao movimentacao)
    {
        if (movimentacao.getQuantidadeFerias() > 5)
        {
            return 3200.0 - (3200.0 * 0.02);
        }
        return 3200.0;
    }
}
