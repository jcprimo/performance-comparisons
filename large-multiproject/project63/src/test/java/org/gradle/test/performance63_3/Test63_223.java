package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_223 {
    private final Production63_223 production = new Production63_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}