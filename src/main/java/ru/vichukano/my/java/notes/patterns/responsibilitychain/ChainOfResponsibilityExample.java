package ru.vichukano.my.java.notes.patterns.responsibilitychain;

import ru.vichukano.my.java.notes.patterns.responsibilitychain.filter.CompoundFilter;
import ru.vichukano.my.java.notes.patterns.responsibilitychain.model.Message;
import java.util.function.Predicate;

class ChainOfResponsibilityExample {
    private final Predicate<Message> nonNullTextPredicate = m -> m.text() != null;
    private final Predicate<Message> nonNullTypePredicate = m -> m.type() != null;
    private final Predicate<Message> textMessagePredicate = m -> "text".equalsIgnoreCase(m.type());

    boolean checkMessage(Message message) {
        var filter = new CompoundFilter(
            nonNullTextPredicate
                .and(nonNullTypePredicate)
                .and(textMessagePredicate)
        );
        return filter.check(message);
    }
}
