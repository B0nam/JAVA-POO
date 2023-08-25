package org.example.domain;

import org.example.domain.enums.TipoAutomovel;

public class Automovel {

    private TipoAutomovel tipoAutomovel;
    private Double valorBase;

    public Automovel(TipoAutomovel tipoAutomovel, Double valorBase) {
        this.tipoAutomovel = tipoAutomovel;
        this.valorBase = valorBase;
    }

    public Double getValorBase() {
        return valorBase;
    }

    public TipoAutomovel getTipoAutomovel() {
        return tipoAutomovel;
    }
}
