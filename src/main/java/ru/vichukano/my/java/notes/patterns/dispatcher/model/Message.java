package ru.vichukano.my.java.notes.patterns.dispatcher.model;

public record Message(
    String text,
    NotificationType type
) {
}
