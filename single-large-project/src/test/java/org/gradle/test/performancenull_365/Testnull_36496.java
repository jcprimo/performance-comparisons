package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36496 {
    private final Productionnull_36496 production = new Productionnull_36496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}