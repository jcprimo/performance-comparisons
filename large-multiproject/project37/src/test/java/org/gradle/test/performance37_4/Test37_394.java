package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_394 {
    private final Production37_394 production = new Production37_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}