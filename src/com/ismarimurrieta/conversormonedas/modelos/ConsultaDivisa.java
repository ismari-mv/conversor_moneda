package com.ismarimurrieta.conversormonedas.modelos;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

// metodo para hacer consulta a la API
public class ConsultaDivisa {
    public Divisa tasasDeCambio(String tipo){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/5a68a8639ab2d0e8e1f23611/latest/" + tipo);


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return  new Gson().fromJson(response.body(),Divisa.class);
        }
        catch (Exception e){
            throw new RuntimeException("Tipo de divisa no encontrado");
        }
    }
}

