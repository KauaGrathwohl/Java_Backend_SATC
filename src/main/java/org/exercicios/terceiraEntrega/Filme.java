package org.exercicios.terceiraEntrega;

import org.springframework.stereotype.Component;

@Component
public class Filme implements Indicavel {
    private String titulo;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}