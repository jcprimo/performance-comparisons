package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43463 {
    private final Productionnull_43463 production = new Productionnull_43463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}