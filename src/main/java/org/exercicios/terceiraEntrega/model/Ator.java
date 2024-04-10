package org.exercicios.terceiraEntrega.model;

import java.io.Serializable;

public class Ator extends Filme implements Indicavel, Serializable {

    private final String nome;
    private final String nacionalidade;
    private final boolean elegivel;
    private short numeroDeIndicacoes;

    public Ator(String nome, String nacionalidade, boolean elegivel) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.elegivel = elegivel;
    }

    @Override
    public boolean elegivel() {
        return elegivel;
    }

    @Override
    public short numeroDeIndicacoes() {
        return numeroDeIndicacoes;
    }
}
