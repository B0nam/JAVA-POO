package sistemafolha;

public enum Cargo
{
    PROGRAMADOR(1)
            {
                @Override
                Double calcularSalario()
                {
                    return 4999.0;
                }
            },
    DBA(2)
            {
                @Override
                Double calcularSalario()
                {
                    return 3200.0;
                }
            },
    GUARDA_TRANSITO(3)
            {
                @Override
                Double calcularSalario()
                {
                    return 10.0;
                }
            },
    ANALISTA(4)
            {
                @Override
                Double calcularSalario()
                {
                    return  2000.0;
                }
            },
    ESTELIONATARIO(5)
            {
                @Override
                Double calcularSalario()
                {
                    return 10000.0;
                }
            };

    private Integer codigo;

    Cargo(Integer codigo)
    {
        this.codigo = codigo;
    }

    public Integer getCodigo()
    {
        return codigo;
    }

    abstract Double calcularSalario();
}
