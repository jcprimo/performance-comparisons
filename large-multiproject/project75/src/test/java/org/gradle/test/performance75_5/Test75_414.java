package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_414 {
    private final Production75_414 production = new Production75_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}