package model;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class RequisicaoAPI{

    public Moedas conectarAPI() throws IOException, InterruptedException {
        String chave = "INSIRA SUA CHAVE API AQUI";
        
        String endereco = "https://v6.exchangerate-api.com/v6/" + chave + "/latest/USD";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();

        ConversaoEspecifica dados = gson.fromJson(response.body(), ConversaoEspecifica.class);

        Map<String, Double> taxas = dados.conversion_rates();

        Moedas moedas = new Moedas(
                taxas.getOrDefault("BRL", 0.0),
                taxas.getOrDefault("USD", 0.0),
                taxas.getOrDefault("ARS", 0.0),
                taxas.getOrDefault("AUD", 0.0)
        );
        return moedas;
    }

    public RequisicaoAPI() {
        super();
    }
}
