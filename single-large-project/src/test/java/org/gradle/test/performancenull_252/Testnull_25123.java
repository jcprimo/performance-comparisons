package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25123 {
    private final Productionnull_25123 production = new Productionnull_25123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}