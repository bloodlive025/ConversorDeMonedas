package com.modules.conversor.modelos;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConversorMonedas {

    public void convertir(String MonedaInicial, String MonedaFinal, double cantidad) throws IOException, InterruptedException {

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .setPrettyPrinting()
                .create();
        String direccion = "https://v6.exchangerate-api.com/v6/7c57028c845dff0e15bc6323/pair/"+MonedaInicial+"/"+MonedaFinal;

        HttpClient client= HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        monedaEXAPI monedaEXAPI = gson.fromJson(json, monedaEXAPI.class);
        System.out.println("El valor "+cantidad+" ["+MonedaInicial+"] "+"corresponde al valor de =>>>: "+ cantidad*monedaEXAPI.conversion_rate()+" ["+MonedaFinal+"]\n");
        System.out.println("*****************************************************************************");
    }

    public double cantidadIngresada(){
        double cantidad;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor que desea convertir");
        cantidad = scanner.nextDouble();
        return cantidad;
    }
}
