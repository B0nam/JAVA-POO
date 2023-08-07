import Domain.TransporteNautico;
import Domain.TransporteTerrestre;

public class Main {
    public static void main(String[] args)
    {
        TransporteNautico transporteNautico = new TransporteNautico();
        TransporteTerrestre transporteTerrestre = new TransporteTerrestre();

        int altura = 20;
        int largura = 100;

        System.out.println("Valores utilizados:");
        System.out.println("Altura = " + altura);
        System.out.println("Largura = " + largura);

        System.out.println(" --- Transporte Nautico --- ");

        System.out.println(transporteNautico.calculaFrete(altura, largura));

        System.out.println(" --- Transporte Terrestre --- ");
        System.out.println(transporteTerrestre.calculaFrete(altura, largura));
    }
}