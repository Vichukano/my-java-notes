package ru.vichukano.my.java.notes.patterns.dispatcher.notification;

import ru.vichukano.my.java.notes.patterns.dispatcher.model.Message;

public interface Notification {

    void send(Message message);

}
