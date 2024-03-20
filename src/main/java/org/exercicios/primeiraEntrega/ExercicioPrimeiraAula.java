package org.exercicios.primeiraEntrega;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExercicioPrimeiraAula {

    public static void main(String[] args) throws Exception {

        // Nome

        String[] nomesArray = retornaTextoServidor("https://venson.net.br/resources/data/nomes.txt");
        String nome = pegaPosicaoRamdomArray(nomesArray);
        String nomeLowerCase = nome.toLowerCase();

        // Sobrenome

        String[] sobrenomesArray = retornaTextoServidor("https://venson.net.br/resources/data/sobrenomes.txt");
        String sobrenome = pegaPosicaoRamdomArray(sobrenomesArray);
        String sobrenomeLowerCase = sobrenome.toLowerCase();

        // Posições

        String[] posicoes = retornaTextoServidor("https://venson.net.br/resources/data/posicoes.txt");
        String posicao = pegaPosicaoRamdomArray(posicoes);

        String posicaoMenosUltimoCaracter = posicao.substring(0, posicao.length() - 1);

        System.out.println(nomeLowerCase + " " + sobrenomeLowerCase + " é um futebolista brasileiro de " + getIdadeRamdom() + " anos que atua como " + posicaoMenosUltimoCaracter + ". Atualmente defende o Corinthians.");
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
