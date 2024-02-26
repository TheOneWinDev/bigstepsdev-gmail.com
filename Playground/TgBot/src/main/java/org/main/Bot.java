package org.main;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import com.google.gson.Gson;
import com.google.gson.JsonObject;


import static org.main.WeatherApi.client;

public class Bot extends TelegramLongPollingBot {

    private static final String API_KEY = "KEY";
    private static final String API_URL = "https://api.weather.yandex.ru/v2/informers?lat=51.670833&lon=39.180556";

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String chatId = update.getMessage().getChatId().toString();
            String messageText = update.getMessage().getText();
            SendMessage message = new SendMessage();
            message.setChatId(chatId);

            if (messageText.toLowerCase().contains("погода")) {
                message.setText(formattedWeatherData());
            } else {
                message.setText("Передайте необходимые параметры команды");
            }

            try {
                execute(message);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    private String getWeatherData() {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(API_URL))
                    .header("X-Yandex-API-Key", API_KEY)
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                return response.body();
            } else {
                throw new IOException("API request failed with status code: " + response.statusCode());
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return "Произошла ошибка при получении данных.";
        }
    }

    private String formattedWeatherData() {
        String json = getWeatherData();
        Gson gson = new Gson();

        JsonObject jsonObject = gson.fromJson(json, JsonObject.class);

        JsonObject factObject = jsonObject.getAsJsonObject("fact");

        int temperature = factObject.get("temp").getAsInt();
        int pressure_mm = factObject.get("pressure_mm").getAsInt();

        String toReturn = "";
        toReturn = "Температура: " + temperature + "°C" + "\n";
        toReturn += "Давление: " + pressure_mm + " мм рт. ст.";

        return toReturn;
    }

    @Override
    public String getBotUsername() {
        return "BOT";
    }

    @Override
    public String getBotToken() {
        return "TOKEN";
    }
}
