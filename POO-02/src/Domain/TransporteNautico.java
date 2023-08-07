package Domain;

public class TransporteNautico extends Transportadora
{
    @Override
    public double calculaFrete(int altura, int largura)
    {
        return (double) (10.0 / 100.0) * (altura + largura);
    }
}
