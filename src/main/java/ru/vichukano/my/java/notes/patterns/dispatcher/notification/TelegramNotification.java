package ru.vichukano.my.java.notes.patterns.dispatcher.notification;

import ru.vichukano.my.java.notes.patterns.dispatcher.model.Message;

class TelegramNotification implements Notification {

    @Override
    public void send(Message message) {
        System.out.println("Send to TELEGRAM: " + message.text());
    }

}
