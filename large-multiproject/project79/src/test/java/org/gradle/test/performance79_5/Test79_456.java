package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_456 {
    private final Production79_456 production = new Production79_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}