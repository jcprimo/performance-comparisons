package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_24 {
    private final Production31_24 production = new Production31_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}