package org.exercicios.terceiraEntrega.dto;

import org.exercicios.terceiraEntrega.model.Ator;

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
