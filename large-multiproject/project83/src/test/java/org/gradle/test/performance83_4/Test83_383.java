package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_383 {
    private final Production83_383 production = new Production83_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}