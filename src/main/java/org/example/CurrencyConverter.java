package org.example;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyConverter {
    private final HttpClient client = HttpClient.newHttpClient();
    private final Gson gson = new Gson();

    public double converter(String moedaOrigem, String moedaDestino, String valor) throws IOException, InterruptedException {
        String url = "https://v6.exchangerate-api.com/v6/52580774653f24759f3fdf99/pair/" + moedaOrigem + "/" + moedaDestino + "/" + valor;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        Par par = gson.fromJson(response.body(), Par.class);
        return par.getValor();
    }
}
