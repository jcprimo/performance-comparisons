package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_248 {
    private final Production35_248 production = new Production35_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}