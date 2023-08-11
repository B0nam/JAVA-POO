import domain.Funcionario;
import domain.Movimentacao;
import domain.Programador;

import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
        Funcionario joao = new Funcionario("joao", 23, LocalDate.of(2000,1,1), 1337, new Programador(), new Movimentacao(5,2,2));
        System.out.println(joao.getNome());
        System.out.println(joao.getCargo().getClass());
    }
}