package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_456 {
    private final Production63_456 production = new Production63_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}