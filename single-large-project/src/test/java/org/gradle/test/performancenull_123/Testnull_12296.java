package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12296 {
    private final Productionnull_12296 production = new Productionnull_12296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}