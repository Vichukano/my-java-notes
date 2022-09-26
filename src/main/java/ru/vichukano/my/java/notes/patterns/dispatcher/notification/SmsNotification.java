package ru.vichukano.my.java.notes.patterns.dispatcher.notification;

import ru.vichukano.my.java.notes.patterns.dispatcher.model.Message;

class SmsNotification implements Notification {

    @Override
    public void send(Message message) {
        System.out.println("Send SMS: " + message.text());
    }

}
