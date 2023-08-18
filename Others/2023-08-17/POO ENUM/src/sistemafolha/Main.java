package sistemafolha;

import sistemafolha.Cargo;
import sistemafolha.Funcionario;

public class Main
{
    public static  void main(String[] args)
    {
        Funcionario manuel = new Funcionario("manuel", "123AB", Cargo.PROGRAMADOR);

        System.out.println(manuel.getNome());
        System.out.println(manuel.getCargo());
        System.out.println(manuel.getCargo().getCodigo());

        //Calculadora calculadora = new Calculadora();
        //System.out.println(calculadora.calculaSalario(manuel));

        System.out.println("Resultado: " + manuel.getCargo().calcularSalario());

    }
}
