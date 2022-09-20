package ru.vichukano.my.java.notes.patterns.visitor;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class VisitorExampleTest {
    private final ByteArrayOutputStream mockOut = new ByteArrayOutputStream();
    private final VisitorExample testTarget = new VisitorExample();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(mockOut));
    }

    @AfterEach
    void reset() {
        System.setOut(System.out);
    }

    @Test
    void shouldVisit() {
        var expectedOut = """
            visit cash in
            visit check balance
            visit withdrawal
            """;

        testTarget.show();

        Assertions.assertEquals(expectedOut, mockOut.toString());
    }
}
