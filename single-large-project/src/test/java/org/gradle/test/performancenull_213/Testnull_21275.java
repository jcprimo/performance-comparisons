package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21275 {
    private final Productionnull_21275 production = new Productionnull_21275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}