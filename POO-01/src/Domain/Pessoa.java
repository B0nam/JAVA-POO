package Domain;

public class Pessoa
{
    private String _Nome;
    private String _DataNascimento;
    private int _Idade;

    public Pessoa()
    {
    }

    public void SetNome(String nome)
    {
        _Nome = nome;
    }

    public void SetDataNascimento(String dataNascimento)
    {
        _DataNascimento = dataNascimento;
    }

    public void SetIdade(int idade)
    {
        _Idade = idade;
    }

    public String GetNome()
    {
        return _Nome;
    }

    public String GetDataNascimento()
    {
        return _DataNascimento;
    }

    public int GetIdade()
    {
        return _Idade;
    }
}
