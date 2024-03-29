package org.exercicios.terceiraEntrega;

import org.springframework.stereotype.Component;

@Component
public class Ator implements Indicavel {
    private String nome;
    private boolean elegivel;
    private int numeroDeIndicacoes;

    @Override
    public boolean isElegivel() {
        return elegivel;
    }

    @Override
    public void setElegivel(boolean elegivel) {
        this.elegivel = elegivel;
    }

    @Override
    public int getNumeroDeIndicacoes() {
        return numeroDeIndicacoes;
    }

    @Override
    public void incrementarIndicacoes() {
        this.numeroDeIndicacoes++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}