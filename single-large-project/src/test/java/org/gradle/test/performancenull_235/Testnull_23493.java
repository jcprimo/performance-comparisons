package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23493 {
    private final Productionnull_23493 production = new Productionnull_23493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}