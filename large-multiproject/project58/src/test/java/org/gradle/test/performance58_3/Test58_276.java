package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_276 {
    private final Production58_276 production = new Production58_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}