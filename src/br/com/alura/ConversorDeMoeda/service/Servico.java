package br.com.alura.ConversorDeMoeda.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class Servico {

    private static final String API_KEY = "d00086e20c952a18d994855e"; // Substitua pela sua chave de API


    public String obterDados(String fromCurrency, String toCurrency, String valorBase) throws IOException, InterruptedException {
        String url = String.format("https://v6.exchangerate-api.com/v6/%s/pair/%s/%s/%s", API_KEY, fromCurrency, toCurrency, valorBase);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        return json;
    }
}


