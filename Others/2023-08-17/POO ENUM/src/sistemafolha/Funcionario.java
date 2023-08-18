package sistemafolha;

public class Funcionario
{
    private String nome;
    private String matricula;
    private Cargo cargo;


    public Funcionario(String nome, String matricula, Cargo cargo)
    {
        this.nome = nome;
        this.matricula = matricula;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
