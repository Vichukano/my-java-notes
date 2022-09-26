package ru.vichukano.my.java.notes.patterns.dispatcher;

import ru.vichukano.my.java.notes.patterns.dispatcher.model.Message;
import ru.vichukano.my.java.notes.patterns.dispatcher.model.NotificationType;
import ru.vichukano.my.java.notes.patterns.dispatcher.notification.Notification;
import ru.vichukano.my.java.notes.patterns.dispatcher.notification.NotificationService;

class DispatcherExample {
    private final Notification service = new NotificationService();

    void show() {
        service.send(new Message("Hello", NotificationType.EMAIL));
        service.send(new Message("Hello", NotificationType.SMS));
        service.send(new Message("Hello", NotificationType.TELEGRAM));
    }
}
