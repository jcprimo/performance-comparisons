package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_205 {
    private final Production6_205 production = new Production6_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}