package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_123 {
    private final Production87_123 production = new Production87_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}