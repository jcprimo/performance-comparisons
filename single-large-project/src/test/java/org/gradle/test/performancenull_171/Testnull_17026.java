package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17026 {
    private final Productionnull_17026 production = new Productionnull_17026("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}