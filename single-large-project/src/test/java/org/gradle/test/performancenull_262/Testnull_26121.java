package org.gradle.test.performancenull_262;

import static org.junit.Assert.*;

public class Testnull_26121 {
    private final Productionnull_26121 production = new Productionnull_26121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}