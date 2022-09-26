package ru.vichukano.my.java.notes.patterns.dispatcher;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class DispatcherExampleTest {
    private final DispatcherExample testTarget = new DispatcherExample();

    @Test
    void shouldDispatch() {
        Assertions.assertThatCode(testTarget::show).doesNotThrowAnyException();
    }
}
