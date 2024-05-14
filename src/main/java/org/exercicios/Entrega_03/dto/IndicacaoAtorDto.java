package org.exercicios.Entrega_03.dto;

import org.exercicios.Entrega_03.model.Ator;

public class IndicacaoAtorDto {

    private Ator indicavel;
    private String categoria;

    public boolean getElegibilidadeIndicavel() {
        return this.indicavel.elegivel();
    }

    public Ator getIndicavel() {
        return this.indicavel;
    }

    public String getCategoria() {
        return this.categoria;
    }
}
