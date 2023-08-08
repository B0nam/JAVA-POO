import heranca.CarrinhoCompra;
import heranca.Monitor;
import heranca.Produto;
import heranca.Teclado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Monitor ASUS1337 = new Monitor("Monitor ASUS", 77);
        Teclado REDDRAGON339 = new Teclado("Teclado RedDragon", 399);
/*
        List<Produto> listaDeProdutos = new ArrayList<Produto>();
        listaDeProdutos.add(ASUS1337);
        listaDeProdutos.add(REDDRAGON339);
*/
        List<Produto> listaDeProdutos = Arrays.asList(ASUS1337, REDDRAGON339);

        CarrinhoCompra carrinho = new CarrinhoCompra();

        System.out.printf(String.valueOf(carrinho.CalcularValorTotal(listaDeProdutos)));

    }
}