package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_203 {
    private final Production80_203 production = new Production80_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}