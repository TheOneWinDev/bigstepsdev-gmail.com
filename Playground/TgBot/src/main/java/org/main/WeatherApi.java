package org.main;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherApi {

    private static final String API_URL = "https://api.weather.yandex.ru/v2/informers";
    static final HttpClient client = HttpClient.newHttpClient();

    public static String getWeatherData(String apiKey, double latitude, double longitude) throws IOException, InterruptedException {
        String query = String.format("""
                    ?lat=%f&lon=%f&lang=ru_RU&limit=1
                """, latitude, longitude);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL + query))
                .header("X-Yandex-API-Key", apiKey)
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            return response.body();
        } else {
            throw new IOException("API request failed with status code: " + response.statusCode());
        }
    }
}
