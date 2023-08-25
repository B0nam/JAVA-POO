package org.example.domain.enums;

public enum EstadoCivil {

    SOLTEIRO(1.08),
    CASADO(0.975),
    UNIAO_ESTAVEL(0.975),
    DIVORCIADO(1.08),
    VIUVO(0.95);

    private Double percentual;

    EstadoCivil(Double percentual) {
        this.percentual = percentual;
    }

    public Double getPercentual() {
        return percentual;
    }
}
