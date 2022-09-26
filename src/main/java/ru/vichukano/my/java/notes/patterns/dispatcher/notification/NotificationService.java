package ru.vichukano.my.java.notes.patterns.dispatcher.notification;

import ru.vichukano.my.java.notes.patterns.dispatcher.model.Message;
import ru.vichukano.my.java.notes.patterns.dispatcher.model.NotificationType;
import java.util.EnumMap;
import java.util.Map;

public class NotificationService implements Notification {
    private final Map<NotificationType, Notification> typeToNotification
        = new EnumMap<>(
        Map.of(
            NotificationType.EMAIL, new EmailNotification(),
            NotificationType.SMS, new SmsNotification(),
            NotificationType.TELEGRAM, new TelegramNotification()
        )
    );

    @Override
    public void send(Message message) {
        typeToNotification.getOrDefault(
            message.type(),
            m -> System.out.println("Unknown notification for: " + m)
        ).send(message);
    }
}
