package org.exercicios.Entrega_03.dto;

import org.exercicios.Entrega_03.model.Filme;

public class IndicacaoFilmeDto {

    private Filme indicavel;
    private String categoria;

    public boolean getElegibilidadeIndicavel() {
        return this.indicavel.elegivel();
    }

    public Filme getIndicavel() {
        return this.indicavel;
    }

    public String getCategoria() {
        return this.categoria;
    }
}
