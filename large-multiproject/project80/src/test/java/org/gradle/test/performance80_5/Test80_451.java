package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_451 {
    private final Production80_451 production = new Production80_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}