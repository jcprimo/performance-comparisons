package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_132 {
    private final Production80_132 production = new Production80_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}