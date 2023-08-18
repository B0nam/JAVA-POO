package sistemafolha;

public class Calculadora {

    public Double calculaSalario(Funcionario funcionario)
    {
        switch (funcionario.getCargo())
        {
            case PROGRAMADOR:
                return 5500.0;
            case DBA:
                return 3200.0;
            case GUARDA_TRANSITO:
                return 10.0;
            case ANALISTA:
                return 2000.0;
            case ESTELIONATARIO:
                return 10000.00;
            default:
                return 0.0;
        }
    }
}
