package org.gradle.test.performancenull_245;

import static org.junit.Assert.*;

public class Testnull_24470 {
    private final Productionnull_24470 production = new Productionnull_24470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}