package com.aluracursos.conversorDivisas.models;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class ApiConnection {
  public Currency getApiData(String baseCode) {
    String baseUrl = "https://v6.exchangerate-api.com/v6/7f3dc6944b5abd3be64d4c18/latest/" + baseCode;
    
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder().uri(URI.create(baseUrl)).build();

    try {
      HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

      return new Gson().fromJson(response.body(), Currency.class);
    } catch (IOException | InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}