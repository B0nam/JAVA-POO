import Domain.Pessoa;

public class Main {
    public static void main(String[] args)
    {
        Pessoa pessoa = new Pessoa();

        pessoa.SetNome("Bonam");
        pessoa.SetDataNascimento("28/04/2004");
        pessoa.SetIdade(19);

        System.out.println("Nome: " + pessoa.GetNome());
        System.out.println("Data de nascimento: " + pessoa.GetDataNascimento());
        System.out.println("Idade: " + pessoa.GetIdade());
    }
}