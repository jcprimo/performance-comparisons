package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_273 {
    private final Production40_273 production = new Production40_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}