package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_211 {
    private final Production92_211 production = new Production92_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}