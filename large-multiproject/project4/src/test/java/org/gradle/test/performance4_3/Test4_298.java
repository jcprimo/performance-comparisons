package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_298 {
    private final Production4_298 production = new Production4_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}