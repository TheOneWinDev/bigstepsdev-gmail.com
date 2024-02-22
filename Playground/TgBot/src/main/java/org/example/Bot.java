// MyAmazingBot.java
package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;

public class Bot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String chatId = update.getMessage().getChatId().toString();
            String userName = update.getMessage().getFrom().getUserName();
            String messageText = update.getMessage().getText();
            SendMessage message = new SendMessage();
            message.setChatId(chatId);

            if (userName != null && userName.toLowerCase().contains("insomniac")) {
                if (messageText.toLowerCase().contains("привет")) {
                    message.setText("Привет, Insomniac!");
                } else {
                    message.setText("Чем могу помочь, Insomniac?");
                }
            } else {
                message.setText("Мы не знакомы.");
            }

            try {
                execute(message);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
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
