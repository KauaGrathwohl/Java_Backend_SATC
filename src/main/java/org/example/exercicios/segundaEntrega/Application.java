package org.example.exercicios.segundaEntrega;

public class Application {

    public static void main(String[] args) {
        String nome = JogadorGerador.geraJogador().getNome();
        String sobrenome = JogadorGerador.geraJogador().getSobrenome();
        String posicao = JogadorGerador.geraJogador().getPosicao();
        int idade = JogadorGerador.geraJogador().getIdade();

        String mensagem = String.format("%s %s é um futebolista brasileiro de %d anos que atua como %s. Atualmente defende o Corinthians.",
                nome.toLowerCase(), sobrenome.toLowerCase(), idade, posicao.substring(0, posicao.length() - 1));

        System.out.println(mensagem);
    }
}
