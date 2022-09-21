package ru.vichukano.my.java.notes.patterns.responsibilitychain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.vichukano.my.java.notes.patterns.responsibilitychain.model.Message;

class ChainOfResponsibilityExampleTest {
    private final ChainOfResponsibilityExample testTarget = new ChainOfResponsibilityExample();

    @Test
    void shouldPassOnlyTextMessage() {
        var textMessage = new Message("text", "some message text");
        var pictureMessage = new Message("picture", null);

        Assertions.assertThat(testTarget.checkMessage(textMessage)).isTrue();
        Assertions.assertThat(testTarget.checkMessage(pictureMessage)).isFalse();
    }
}
