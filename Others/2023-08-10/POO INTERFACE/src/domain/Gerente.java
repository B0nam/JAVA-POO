package domain;

public class Gerente implements Cargo
{
    @Override
    public double valorSalario(Movimentacao movimentacao) {
        return 5900.0;
    }
}
