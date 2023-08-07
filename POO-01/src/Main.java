import Domain.Pessoa;

public class Main {
    public static void main(String[] args)
    {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Bonam");
        pessoa.setDataNascimento("28/04/2004");
        pessoa.setIdade(19);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Data de nascimento: " + pessoa.getDataNascimento());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}