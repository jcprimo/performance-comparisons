package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_490 {
    private final Production98_490 production = new Production98_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}