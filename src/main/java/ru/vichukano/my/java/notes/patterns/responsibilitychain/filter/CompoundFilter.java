package ru.vichukano.my.java.notes.patterns.responsibilitychain.filter;

import ru.vichukano.my.java.notes.patterns.responsibilitychain.model.Message;
import java.util.function.Predicate;

public class CompoundFilter {
    private final Predicate<Message> compoundFilter;

    public CompoundFilter(Predicate<Message> compoundFilter) {
        this.compoundFilter = compoundFilter;
    }

    public boolean check(Message message) {
        return compoundFilter.test(message);
    }
}
