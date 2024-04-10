package org.exercicios.Entrega_03.model;

import java.io.Serializable;

public class Indicacao implements Serializable {

    private final Indicavel indicavel;
    private final String categoria;

    public Indicacao(Filme indicavel, String categoria) {
        this.categoria = categoria;
        this.indicavel = indicavel;
    }

    public Indicavel getIndicavel() {
        return this.indicavel;
    }

    public boolean getElegibilidadeIndicavel() {
        return this.indicavel.elegivel();
    }
}
