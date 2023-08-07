package Domain;

public class Pessoa
{
    private String nome;
    private String datanascimento;
    private int idade;

    public Pessoa()
    {
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento)
    {
        this.datanascimento = dataNascimento;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public String getNome()
    {
        return nome;
    }

    public String getDataNascimento()
    {
        return datanascimento;
    }

    public int getIdade()
    {
        return idade;
    }
}
