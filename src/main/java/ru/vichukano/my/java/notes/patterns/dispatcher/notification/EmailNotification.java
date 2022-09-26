package ru.vichukano.my.java.notes.patterns.dispatcher.notification;

import ru.vichukano.my.java.notes.patterns.dispatcher.model.Message;

class EmailNotification implements Notification {

    @Override
    public void send(Message message) {
        System.out.println("Send to EMAIL: " + message.text());
    }

}
