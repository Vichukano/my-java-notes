package ru.vichukano.my.java.notes.patterns.command;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CommandExampleTest {
    private final CommandExample testTarget = new CommandExample();

    @Test
    void shouldExecuteAllCommand() {
        Assertions.assertThatCode(testTarget::show).doesNotThrowAnyException();
    }
}
