package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_279 {
    private final Production93_279 production = new Production93_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}