package org.exercicios.segundaEntrega;

public class Jogador {

    private final String nome;
    private final String sobrenome;
    private final String posicao;
    private final int idade;
    private final String clube = "Corinthians";

    public Jogador(String nome, String sobrenome, String posicao, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.posicao = posicao;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getPosicao() {
        return posicao;
    }

    public int getIdade() {
        return idade;
    }

    public String getClube() {
        return clube;
    }

    public String getDescricao() {
        String posicaoSemUltimoCaracter = posicao.substring(0, posicao.length() - 1);
        return nome.toLowerCase() + " " + sobrenome.toLowerCase() + " é um futebolista brasileiro de " + idade + " anos que atua como " + posicaoSemUltimoCaracter + ". Atualmente defende o " + clube + ".";
    }
}