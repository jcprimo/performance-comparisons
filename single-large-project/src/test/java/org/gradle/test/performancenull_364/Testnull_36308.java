package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36308 {
    private final Productionnull_36308 production = new Productionnull_36308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}