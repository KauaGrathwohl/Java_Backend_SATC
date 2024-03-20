package org.example.exercicios.segundaEntrega;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JogadorGerador {

    private static final String URL_NOMES = "https://venson.net.br/resources/data/nomes.txt";
    private static final String URL_SOBRENOMES = "https://venson.net.br/resources/data/sobrenomes.txt";
    private static final String URL_POSICOES = "https://venson.net.br/resources/data/posicoes.txt";

    private static String[] nomes;
    private static String[] sobrenomes;
    private static String[] posicoes;

    static {
        try {
            nomes = retornaTextoServidor(URL_NOMES);
            sobrenomes = retornaTextoServidor(URL_SOBRENOMES);
            posicoes = retornaTextoServidor(URL_POSICOES);
        } catch (Exception e) {
            Logger logger = Logger.getLogger(JogadorGerador.class.getName());
            logger.log(Level.SEVERE, "Error ao retornar dados do servidor", e);
        }
    }

    public static Jogador geraJogador() {
        String nome = pegaPosicaoRamdomArray(nomes);
        String sobrenome = pegaPosicaoRamdomArray(sobrenomes);
        String posicao = pegaPosicaoRamdomArray(posicoes);
        int idade = getIdadeRamdom();

        return new Jogador(nome, sobrenome, posicao, idade);
    }

    private static String[] retornaTextoServidor(String url) throws Exception {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String texto = response.body();

        return texto.split("\n");
    }

    private static String pegaPosicaoRamdomArray(String[] nomeArray) {
        int indiceAleatorioNomes = (int) Math.floor(Math.random() * nomeArray.length);

        return nomeArray[indiceAleatorioNomes];
    }

    private static int getIdadeRamdom() {
        return (int) (Math.random() * (40 - 17) + 17);
    }
}
