package com.modules.conversor.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.modules.conversor.modelos.ConversorMonedas;
import com.modules.conversor.modelos.monedaEXAPI;
import com.modules.conversor.modelos.moneda;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {


        /*
        Scanner lectura = new Scanner(System.in);
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .setPrettyPrinting()
                .create();
        System.out.println("Escriba la moneda");
        var busqueda=lectura.nextLine();
        String direccion = "https://v6.exchangerate-api.com/v6/7c57028c845dff0e15bc6323/latest/"+busqueda;




        HttpClient client= HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        monedaEXAPI monedaEXAPI = gson.fromJson(json, monedaEXAPI.class);
        System.out.println(monedaEXAPI);
        moneda miMoneda = new moneda(monedaEXAPI);
        System.out.println("Moneda convertido: "+miMoneda);*/
        boolean controlador= true;
        int seleccion;
        double cantidad;
        Scanner scanner = new Scanner(System.in);
        ConversorMonedas conversor = new ConversorMonedas();

        while(controlador){
            System.out.println("Sea bienvenido/a al conversor de Moneda =]");
            System.out.println("1)Dolar =>> Peso Argentino");
            System.out.println("2) Peso argentino =>> Dolar");
            System.out.println("3) Dolar =>> Real Brasileño");
            System.out.println("4) Real Brasileño =>> Dolar");
            System.out.println("5) Dolar =>> Peso Colombiano");
            System.out.println("6) Peso Colombiano =>> Dolar");
            System.out.println("7) Salir");
            System.out.println("*******************************************************\n");
            seleccion=scanner.nextInt();

            switch (seleccion){
                case 1:
                    cantidad=conversor.cantidadIngresada();
                    conversor.convertir("USD","ARS",cantidad);
                    break;
                case 2:
                    cantidad=conversor.cantidadIngresada();
                    conversor.convertir("ARS","USD",cantidad);
                    break;
                case 3:
                    cantidad=conversor.cantidadIngresada();
                    conversor.convertir("USD","BRL",cantidad);
                    break;
                case 4:
                    cantidad=conversor.cantidadIngresada();
                    conversor.convertir("BRL","USD",cantidad);
                    break;
                case 5:
                    cantidad=conversor.cantidadIngresada();
                    conversor.convertir("USD","COP",cantidad);
                    break;
                case 6:
                    cantidad=conversor.cantidadIngresada();
                    conversor.convertir("COP","USD",cantidad);
                    break;
                case 7:
                    controlador=false;
            }
        }

    }
}