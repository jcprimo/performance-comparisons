package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18105 {
    private final Productionnull_18105 production = new Productionnull_18105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}