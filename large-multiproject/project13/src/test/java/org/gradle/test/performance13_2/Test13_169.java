package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_169 {
    private final Production13_169 production = new Production13_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}