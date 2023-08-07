package Domain;

public class TransporteTerrestre extends Transportadora
{
    @Override
    public double calculaFrete(int altura, int largura)
    {
        return (double) (20.0 / 100.0) * (altura + largura);
    }
}
