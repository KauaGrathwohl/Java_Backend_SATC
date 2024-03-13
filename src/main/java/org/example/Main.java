package org.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;

public class Main {
   private static final String url = "https://venson.net.br/resources/data/nomes.txt";

   public static void main(String[] args) throws Exception {

       HttpClient client = HttpClient.newHttpClient();

       HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
       HttpResponse <String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

       String texto = response.body();

       String[] listaDeNomes = texto.split("\n");

       System.out.println(listaDeNomes[0]);
       System.out.println(listaDeNomes.length);
   }
}