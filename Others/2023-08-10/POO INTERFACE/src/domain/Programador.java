package domain;

public class Programador implements Cargo
{
    @Override
    public double valorSalario(Movimentacao movimentacao)
    {
        if (movimentacao.getQuantidadeFalta() > 0 || movimentacao.getQuantidadeAfastamento() > 0)
        {
            return 1900.0 - (1900.0 / 30 * movimentacao.getQuantidadeFalta());
        }

        return 1900.0;
    }
}
